package org.hyperskill.musicplayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0014\u0010\u0012\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/hyperskill/musicplayer/SelectorRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/hyperskill/musicplayer/SongSelector;", "Lorg/hyperskill/musicplayer/SelectorRecyclerAdapter$SelectorViewHolder;", "loadedPlaylist", "", "viewModel", "Lorg/hyperskill/musicplayer/MainViewModel;", "(Ljava/util/List;Lorg/hyperskill/musicplayer/MainViewModel;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "list", "SelectorViewHolder", "Music_Player-task_debug"})
public final class SelectorRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<org.hyperskill.musicplayer.SongSelector, org.hyperskill.musicplayer.SelectorRecyclerAdapter.SelectorViewHolder> {
    private final org.hyperskill.musicplayer.MainViewModel viewModel = null;
    
    public SelectorRecyclerAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<org.hyperskill.musicplayer.SongSelector> loadedPlaylist, @org.jetbrains.annotations.NotNull
    org.hyperskill.musicplayer.MainViewModel viewModel) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.hyperskill.musicplayer.SelectorRecyclerAdapter.SelectorViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    org.hyperskill.musicplayer.SelectorRecyclerAdapter.SelectorViewHolder holder, int position) {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull
    java.util.List<org.hyperskill.musicplayer.SongSelector> list) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0019\u0010\u0010\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lorg/hyperskill/musicplayer/SelectorRecyclerAdapter$SelectorViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "artist", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getArtist", "()Landroid/widget/TextView;", "checkbox", "Landroid/widget/CheckBox;", "getCheckbox", "()Landroid/widget/CheckBox;", "duration", "getDuration", "title", "getTitle", "Music_Player-task_debug"})
    public static final class SelectorViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView artist = null;
        private final android.widget.TextView title = null;
        private final android.widget.CheckBox checkbox = null;
        private final android.widget.TextView duration = null;
        
        public SelectorViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        public final android.widget.TextView getArtist() {
            return null;
        }
        
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final android.widget.CheckBox getCheckbox() {
            return null;
        }
        
        public final android.widget.TextView getDuration() {
            return null;
        }
    }
}