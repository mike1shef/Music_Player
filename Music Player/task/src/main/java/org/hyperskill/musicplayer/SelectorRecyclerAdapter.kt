package org.hyperskill.musicplayer

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.ListAdapter

class SelectorRecyclerAdapter (
     loadedPlaylist : List<SongSelector>,
    private val viewModel : MainViewModel,
    ) : ListAdapter<SongSelector, SelectorRecyclerAdapter.SelectorViewHolder>(
    object : DiffUtil.ItemCallback<SongSelector>() {
        override fun areItemsTheSame(oldItem: SongSelector, newItem: SongSelector): Boolean {
            return oldItem.song == newItem.song
        }

        override fun areContentsTheSame(oldItem: SongSelector, newItem: SongSelector): Boolean {
            return oldItem.song == newItem.song && oldItem.isSelected == newItem.isSelected
        }

        override fun getChangePayload(oldItem: SongSelector, newItem: SongSelector): Any? {
            return Bundle().apply {
                if (oldItem.song.id != newItem.song.id) {
                    putInt("KEY_SONG_ID", newItem.song.id)
                }
                if (oldItem.song.artist != newItem.song.artist) {
                    putString("KEY_SONG_ARTIST", newItem.song.artist)
                }
                if (oldItem.song.title != newItem.song.title) {
                    putString("KEY_SONG_TITLE", newItem.song.title)
                }
                if (oldItem.song.duration != newItem.song.duration) {
                    putInt("KEY_SONG_DURATION", newItem.song.duration)
                }
                if (oldItem.isSelected != newItem.isSelected) {
                    putBoolean("KEY_IS_SELECTED", newItem.isSelected)
                }
            }
        }
    }){
        init { submitList(loadedPlaylist)}

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectorViewHolder {
            val holder = SelectorViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item_song_selector, parent, false))

            holder.itemView.setOnClickListener {
                val position = holder.adapterPosition
                val songSelector = getItem(position)

                if (position != RecyclerView.NO_POSITION) {
                    if (songSelector.isSelected) {
                        songSelector.isSelected = false
                        holder.checkbox.isChecked = false
                        holder.itemView.setBackgroundColor(Color.WHITE)
                    } else {
                        songSelector.isSelected = true
                        holder.checkbox.isChecked = true
                       holder.itemView.setBackgroundColor(Color.LTGRAY)

                    }
                }
            }

            return holder
        }

    override fun onBindViewHolder(holder: SelectorViewHolder, position: Int) {
        val song = getItem(position)

        holder.artist.text = song.song.artist
        holder.title.text = song.song.title
        holder.checkbox.isChecked = song.isSelected
        holder.duration.text = convertMsToTime(song.song.duration)

        if (holder.checkbox.isChecked) {
            holder.itemView.setBackgroundColor(Color.LTGRAY)
        } else holder.itemView.setBackgroundColor(Color.WHITE)
    }

    fun updateData(list: List<SongSelector>) {
        submitList(list)
    }

    class SelectorViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val artist = view.findViewById<TextView>(R.id.songSelectorItemTvArtist)
        val title = view.findViewById<TextView>(R.id.songSelectorItemTvTitle)
        val checkbox = view.findViewById<CheckBox>(R.id.songSelectorItemCheckBox)
        val duration = view.findViewById<TextView>(R.id.songSelectorItemTvDuration)
        }

    }