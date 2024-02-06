package org.hyperskill.musicplayer

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SelectorRecyclerAdapter (
     private  var loadedPlaylist : List<SongSelector>,
    private val viewModel : MainViewModel,
    ) : RecyclerView.Adapter<SelectorRecyclerAdapter.SelectorViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectorViewHolder {
            val holder = SelectorViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item_song_selector, parent, false))

            holder.itemView.setOnClickListener {
                val position = holder.adapterPosition
                if (position >= 0) {
                    if (loadedPlaylist[position].isSelected){
                        loadedPlaylist[position].isSelected = false
                        holder.checkbox.isChecked = false
                        holder.itemView.setBackgroundColor(Color.WHITE)
                    } else {
                        loadedPlaylist[position].isSelected = true
                       holder.checkbox.isChecked = true
                       holder.itemView.setBackgroundColor(Color.LTGRAY)

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

        if (holder.checkbox.isChecked) {
            holder.itemView.setBackgroundColor(Color.LTGRAY)
        } else holder.itemView.setBackgroundColor(Color.WHITE)
    }
    override fun getItemCount(): Int {
        return loadedPlaylist.size
    }
    fun updateData() {
        this.loadedPlaylist = viewModel.selectedSongs
    }

    class SelectorViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val artist = view.findViewById<TextView>(R.id.songSelectorItemTvArtist)
        val title = view.findViewById<TextView>(R.id.songSelectorItemTvTitle)
        val checkbox = view.findViewById<CheckBox>(R.id.songSelectorItemCheckBox)
        val duration = view.findViewById<TextView>(R.id.songSelectorItemTvDuration)
        }

    }