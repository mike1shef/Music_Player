package org.hyperskill.musicplayer

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDataBaseHelper (context: Context) : SQLiteOpenHelper (context, DB_NAME, null,DB_VERSION) {
    companion object{
        private val DB_NAME = "musicPlayerDatabase"
        private val DB_VERSION = 1
        private val tableName = "playlist"
        private val columnPlaylistName = "playlistName"
        private val columnSongId = "songId"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS $tableName(" +
                "$columnPlaylistName TEXT, " +
                "$columnSongId INTEGER, " +
                "PRIMARY KEY ($columnPlaylistName, $columnSongId));"
        db?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val DROP_TABLE = "DROP TABLE IF EXISTS $tableName"
        db?.execSQL(DROP_TABLE)
        onCreate(db)
    }

    fun removePlaylist (playlistName : String) {
        val db = this.writableDatabase
        db.delete(tableName, "playlistName= ?", arrayOf(playlistName))
    }

    fun addPlaylist (playlistName: String, songList: List<Song>) {
        val db = this.writableDatabase
        val values = ContentValues()

        if (loadSongsDB(playlistName).isNotEmpty()){
            removePlaylist(playlistName)
        }
        for (song in songList) {
            values.put("playlistName", playlistName)
            values.put("songId", song.id)
            db.insert(tableName, null, values)
        }
    }

    fun loadSongsDB(playlistName: String) : List<Int>{
        val db = this.readableDatabase

        val projection = arrayOf(columnPlaylistName, columnSongId)
        val selection = "$columnPlaylistName = ?"
        val selectionArgs = arrayOf(playlistName)

        val cursor = db.query(
            tableName,
            projection,
            selection,
            selectionArgs,
            null,
            null,
            null
        )
        val items = mutableListOf<Int>()

        cursor.use {cursor ->
            val playlistNameColumn = cursor.getColumnIndexOrThrow(columnPlaylistName)
            val songColumn = cursor.getColumnIndexOrThrow(columnSongId)

            while (cursor.moveToNext()) {
                val playlistName = cursor.getString(playlistNameColumn)
                val songId = cursor.getInt(songColumn)
                items.add(songId)
            }
        }
        return items.toList()
    }

    fun loadAllPlaylists() : Array<String>{
        val db = this.readableDatabase

        val cursor = db.query(
            tableName,
            arrayOf(columnPlaylistName),
            null,
            null,
            columnPlaylistName,
            null,
            null
        )
        val playlists = mutableListOf<String>()

        cursor.use {cursor ->
            val playlistNameColumn = cursor.getColumnIndexOrThrow(columnPlaylistName)
            while (cursor.moveToNext()) {
                val playlistName = cursor.getString(playlistNameColumn)
                playlists.add(playlistName)
            }
        }
        return playlists.toTypedArray()
    }
}