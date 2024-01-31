package com.notes.app.model.service;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/notes/app/model/service/StorageService;", "", "notes", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/notes/app/model/Note;", "getNotes", "()Lkotlinx/coroutines/flow/Flow;", "createNote", "", "note", "(Lcom/notes/app/model/Note;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNote", "noteId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readNote", "updateNote", "app_debug"})
public abstract interface StorageService {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.notes.app.model.Note>> getNotes();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object createNote(@org.jetbrains.annotations.NotNull
    com.notes.app.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object readNote(@org.jetbrains.annotations.NotNull
    java.lang.String noteId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.notes.app.model.Note> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateNote(@org.jetbrains.annotations.NotNull
    com.notes.app.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull
    java.lang.String noteId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}