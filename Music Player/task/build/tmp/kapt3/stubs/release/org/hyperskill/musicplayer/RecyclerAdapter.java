package org.hyperskill.musicplayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0006\u0010\u0017\u001a\u00020\fJ\u0014\u0010\u0018\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005J\u0006\u0010\u0019\u001a\u00020\fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/hyperskill/musicplayer/RecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/hyperskill/musicplayer/Song;", "Lorg/hyperskill/musicplayer/RecyclerAdapter$PlaylistViewHolder;", "playlist", "", "vm", "Lorg/hyperskill/musicplayer/MainViewModel;", "context", "Landroid/content/Context;", "onItemLongClick", "Lkotlin/Function1;", "", "(Ljava/util/List;Lorg/hyperskill/musicplayer/MainViewModel;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "currentPlayingHolder", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshAdapter", "update", "updateAdapterIcon", "PlaylistViewHolder", "Music_Player-task_release"})
public final class RecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<org.hyperskill.musicplayer.Song, org.hyperskill.musicplayer.RecyclerAdapter.PlaylistViewHolder> {
    private final org.hyperskill.musicplayer.MainViewModel vm = null;
    private final android.content.Context context = null;
    private final kotlin.jvm.functions.Function1<org.hyperskill.musicplayer.Song, kotlin.Unit> onItemLongClick = null;
    private org.hyperskill.musicplayer.RecyclerAdapter.PlaylistViewHolder currentPlayingHolder;
    
    public RecyclerAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<org.hyperskill.musicplayer.Song> playlist, @org.jetbrains.annotations.NotNull
    org.hyperskill.musicplayer.MainViewModel vm, @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.hyperskill.musicplayer.Song, kotlin.Unit> onItemLongClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.hyperskill.musicplayer.RecyclerAdapter.PlaylistViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    org.hyperskill.musicplayer.RecyclerAdapter.PlaylistViewHolder holder, int position) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    java.util.List<org.hyperskill.musicplayer.Song> playlist) {
    }
    
    public final void refreshAdapter() {
    }
    
    public final void updateAdapterIcon() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lorg/hyperskill/musicplayer/RecyclerAdapter$PlaylistViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "artist", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getArtist", "()Landroid/widget/TextView;", "duration", "getDuration", "icon", "Landroid/widget/ImageButton;", "getIcon", "()Landroid/widget/ImageButton;", "title", "getTitle", "Music_Player-task_release"})
    public static final class PlaylistViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView artist = null;
        private final android.widget.TextView title = null;
        private final android.widget.ImageButton icon = null;
        private final android.widget.TextView duration = null;
        
        public PlaylistViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        public final android.widget.TextView getArtist() {
            return null;
        }
        
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final android.widget.ImageButton getIcon() {
            return null;
        }
        
        public final android.widget.TextView getDuration() {
            return null;
        }
    }
}