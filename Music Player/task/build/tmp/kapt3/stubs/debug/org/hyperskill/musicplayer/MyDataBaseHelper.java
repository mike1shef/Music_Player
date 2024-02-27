package org.hyperskill.musicplayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0011\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\r\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\u0019"}, d2 = {"Lorg/hyperskill/musicplayer/MyDataBaseHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addPlaylist", "", "playlistName", "", "songList", "", "Lorg/hyperskill/musicplayer/Song;", "loadAllPlaylists", "", "()[Ljava/lang/String;", "loadSongsDB", "", "onCreate", "db", "Landroid/database/sqlite/SQLiteDatabase;", "onUpgrade", "oldVersion", "newVersion", "removePlaylist", "Companion", "Music_Player-task_debug"})
public final class MyDataBaseHelper extends android.database.sqlite.SQLiteOpenHelper {
    @org.jetbrains.annotations.NotNull
    public static final org.hyperskill.musicplayer.MyDataBaseHelper.Companion Companion = null;
    private static final java.lang.String DB_NAME = "musicPlayerDatabase";
    private static final int DB_VERSION = 1;
    private static final java.lang.String tableName = "playlist";
    private static final java.lang.String columnPlaylistName = "playlistName";
    private static final java.lang.String columnSongId = "songId";
    
    public MyDataBaseHelper(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null, null, null, 0);
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.database.sqlite.SQLiteDatabase db) {
    }
    
    @java.lang.Override
    public void onUpgrade(@org.jetbrains.annotations.Nullable
    android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    
    public final void removePlaylist(@org.jetbrains.annotations.NotNull
    java.lang.String playlistName) {
    }
    
    public final void addPlaylist(@org.jetbrains.annotations.NotNull
    java.lang.String playlistName, @org.jetbrains.annotations.NotNull
    java.util.List<org.hyperskill.musicplayer.Song> songList) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> loadSongsDB(@org.jetbrains.annotations.NotNull
    java.lang.String playlistName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] loadAllPlaylists() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lorg/hyperskill/musicplayer/MyDataBaseHelper$Companion;", "", "()V", "DB_NAME", "", "DB_VERSION", "", "columnPlaylistName", "columnSongId", "tableName", "Music_Player-task_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}