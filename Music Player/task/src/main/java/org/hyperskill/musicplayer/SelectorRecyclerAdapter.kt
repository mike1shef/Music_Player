package org.hyperskill.musicplayer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SelectorRecyclerAdapter (
    private var loadedPlaylist : List<SongSelector>,
    //private val onItemClick : (SongSelector) -> Unit
    ) : RecyclerView.Adapter<SelectorRecyclerAdapter.SelectorViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectorViewHolder {
            val holder = SelectorViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_song_selector, parent, false))

            holder.itemView.setOnClickListener {
                val position = holder.adapterPosition
                if (position >= 0) {
                    if (loadedPlaylist[position].isSelected){
                        loadedPlaylist[position].isSelected = false
                        holder.checkbox.isChecked = false
                    } else {
                        loadedPlaylist[position].isSelected = true
                       holder.checkbox.isChecked = true
                    }
                }
            }

            return holder
        }

    override fun onBindViewHolder(holder: SelectorViewHolder, position: Int) {
        val song = loadedPlaylist[position]

        holder.artist.text = song.song.artist
        holder.title.text = song.song.title
        holder.checkbox.isChecked = song.isSelected
        holder.duration.text = convertMsToTime(song.song.duration)
    }
    override fun getItemCount(): Int {
        return loadedPlaylist.size
    }

    class SelectorViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val artist = view.findViewById<TextView>(R.id.songSelectorItemTvArtist)
        val title = view.findViewById<TextView>(R.id.songSelectorItemTvTitle)
        val checkbox = view.findViewById<CheckBox>(R.id.songSelectorItemCheckBox)
        val duration = view.findViewById<TextView>(R.id.songSelectorItemTvDuration)
        }

    }