package com.notes.app.screens.notes_list;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010J\u001a\u0010\u0012\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u0010J\u0006\u0010\u0014\u001a\u00020\u000eJ\"\u0010\u0015\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/notes/app/screens/notes_list/NotesListViewModel;", "Lcom/notes/app/screens/NotesAppViewModel;", "accountService", "Lcom/notes/app/model/service/AccountService;", "storageService", "Lcom/notes/app/model/service/StorageService;", "(Lcom/notes/app/model/service/AccountService;Lcom/notes/app/model/service/StorageService;)V", "notes", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/notes/app/model/Note;", "getNotes", "()Lkotlinx/coroutines/flow/Flow;", "initialize", "", "restartApp", "Lkotlin/Function1;", "", "onAddClick", "openScreen", "onDeleteAccountClick", "onNoteClick", "note", "onSignOutClick", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class NotesListViewModel extends com.notes.app.screens.NotesAppViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.notes.app.model.service.AccountService accountService = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.notes.app.model.Note>> notes = null;
    
    @javax.inject.Inject
    public NotesListViewModel(@org.jetbrains.annotations.NotNull
    com.notes.app.model.service.AccountService accountService, @org.jetbrains.annotations.NotNull
    com.notes.app.model.service.StorageService storageService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.notes.app.model.Note>> getNotes() {
        return null;
    }
    
    public final void initialize(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> restartApp) {
    }
    
    public final void onAddClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> openScreen) {
    }
    
    public final void onNoteClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> openScreen, @org.jetbrains.annotations.NotNull
    com.notes.app.model.Note note) {
    }
    
    public final void onSignOutClick() {
    }
    
    public final void onDeleteAccountClick() {
    }
}