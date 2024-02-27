package org.hyperskill.musicplayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0014\u0010$\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010%\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u000fJ\u000e\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bJ\u001a\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0005J\u0006\u0010*\u001a\u00020)J\b\u0010+\u001a\u0004\u0018\u00010,J\b\u0010-\u001a\u0004\u0018\u00010.J\b\u0010/\u001a\u0004\u0018\u00010\u0019J\b\u00100\u001a\u000201H\u0002J\u0014\u00102\u001a\u0002012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0014\u00104\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u00105\u001a\u000201J\u0006\u00106\u001a\u000201J\u000e\u00107\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u00108\u001a\u000201J\u0014\u00109\u001a\u0002012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013\u00a8\u0006<"}, d2 = {"Lorg/hyperskill/musicplayer/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_currentPlaylist", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lorg/hyperskill/musicplayer/Song;", "_currentTrack", "Lorg/hyperskill/musicplayer/Track;", "_playlists", "", "", "_selectedSongs", "Lorg/hyperskill/musicplayer/SongSelector;", "_state", "Lorg/hyperskill/musicplayer/ActivityState;", "currentPlaylist", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentPlaylist", "()Lkotlinx/coroutines/flow/StateFlow;", "currentTrack", "getCurrentTrack", "loadedPlaylist", "getLoadedPlaylist", "mediaPlayer", "Landroid/media/MediaPlayer;", "playlists", "", "getPlaylists", "()Ljava/util/Map;", "state", "getState", "addSongsToPlaylist", "", "name", "list", "addSongsToSelector", "changeState", "deletePlaylist", "findSongsById", "listOfId", "", "findTrackInPlaylist", "getCurrentTrackState", "Lorg/hyperskill/musicplayer/SongState;", "getCurrentTrackUri", "Landroid/net/Uri;", "getMediaPlayer", "initializeCurrentTrack", "Lkotlinx/coroutines/Job;", "loadPlaylist", "playlist", "loadWhenChecked", "pauseCurrentTrack", "playCurrentTrack", "setMediaPlayer", "stopCurrentTrack", "updateCurrentPlaylist", "updateCurrentTrack", "song", "Music_Player-task_release"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.MutableStateFlow<org.hyperskill.musicplayer.ActivityState> _state = null;
    private android.media.MediaPlayer mediaPlayer;
    private final java.util.Map<java.lang.String, java.util.List<org.hyperskill.musicplayer.Song>> _playlists = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<org.hyperskill.musicplayer.SongSelector>> _selectedSongs = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<org.hyperskill.musicplayer.Song>> _currentPlaylist = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<org.hyperskill.musicplayer.Track> _currentTrack = null;
    
    public MainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<org.hyperskill.musicplayer.ActivityState> getState() {
        return null;
    }
    
    public final void setMediaPlayer(@org.jetbrains.annotations.NotNull
    android.media.MediaPlayer mediaPlayer) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri getCurrentTrackUri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.media.MediaPlayer getMediaPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.util.List<org.hyperskill.musicplayer.Song>> getPlaylists() {
        return null;
    }
    
    public final void addSongsToPlaylist(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.util.List<org.hyperskill.musicplayer.Song> list) {
    }
    
    public final void deletePlaylist(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<org.hyperskill.musicplayer.SongSelector>> getLoadedPlaylist() {
        return null;
    }
    
    public final void addSongsToSelector(@org.jetbrains.annotations.NotNull
    java.util.List<org.hyperskill.musicplayer.Song> list) {
    }
    
    public final void loadWhenChecked(@org.jetbrains.annotations.NotNull
    java.util.List<org.hyperskill.musicplayer.Song> list) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<org.hyperskill.musicplayer.Song>> getCurrentPlaylist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<org.hyperskill.musicplayer.Track> getCurrentTrack() {
        return null;
    }
    
    public final int findTrackInPlaylist() {
        return 0;
    }
    
    private final kotlinx.coroutines.Job initializeCurrentTrack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job loadPlaylist(@org.jetbrains.annotations.NotNull
    java.util.List<org.hyperskill.musicplayer.Song> playlist) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateCurrentPlaylist(@org.jetbrains.annotations.NotNull
    java.util.List<org.hyperskill.musicplayer.Song> playlist) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.hyperskill.musicplayer.Song> findSongsById(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> listOfId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job stopCurrentTrack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job playCurrentTrack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job pauseCurrentTrack() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateCurrentTrack(@org.jetbrains.annotations.NotNull
    org.hyperskill.musicplayer.Song song) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.hyperskill.musicplayer.SongState getCurrentTrackState() {
        return null;
    }
    
    public final void changeState(@org.jetbrains.annotations.NotNull
    org.hyperskill.musicplayer.ActivityState state) {
    }
}