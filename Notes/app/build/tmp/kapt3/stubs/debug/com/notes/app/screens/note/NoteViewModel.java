package com.notes.app.screens.note;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\"\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0014J\u001c\u0010\u0015\u001a\u00020\r2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0014H\u0002J\u0014\u0010\u0016\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/notes/app/screens/note/NoteViewModel;", "Lcom/notes/app/screens/NotesAppViewModel;", "accountService", "Lcom/notes/app/model/service/AccountService;", "storageService", "Lcom/notes/app/model/service/StorageService;", "(Lcom/notes/app/model/service/AccountService;Lcom/notes/app/model/service/StorageService;)V", "note", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/notes/app/model/Note;", "getNote", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "deleteNote", "", "popUpScreen", "Lkotlin/Function0;", "initialize", "noteId", "", "restartApp", "Lkotlin/Function1;", "observeAuthenticationState", "saveNote", "updateNote", "newText", "Companion", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class NoteViewModel extends com.notes.app.screens.NotesAppViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.notes.app.model.service.AccountService accountService = null;
    @org.jetbrains.annotations.NotNull
    private final com.notes.app.model.service.StorageService storageService = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.notes.app.model.Note> note = null;
    @org.jetbrains.annotations.NotNull
    private static final com.notes.app.model.Note DEFAULT_NOTE = null;
    @org.jetbrains.annotations.NotNull
    public static final com.notes.app.screens.note.NoteViewModel.Companion Companion = null;
    
    @javax.inject.Inject
    public NoteViewModel(@org.jetbrains.annotations.NotNull
    com.notes.app.model.service.AccountService accountService, @org.jetbrains.annotations.NotNull
    com.notes.app.model.service.StorageService storageService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.notes.app.model.Note> getNote() {
        return null;
    }
    
    public final void initialize(@org.jetbrains.annotations.NotNull
    java.lang.String noteId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> restartApp) {
    }
    
    private final void observeAuthenticationState(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> restartApp) {
    }
    
    public final void updateNote(@org.jetbrains.annotations.NotNull
    java.lang.String newText) {
    }
    
    public final void saveNote(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> popUpScreen) {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> popUpScreen) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/notes/app/screens/note/NoteViewModel$Companion;", "", "()V", "DEFAULT_NOTE", "Lcom/notes/app/model/Note;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}