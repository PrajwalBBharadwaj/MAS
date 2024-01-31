package com.notes.app.screens.notes_list;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0007\u001aD\u0010\b\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"NoteItem", "", "note", "Lcom/notes/app/model/Note;", "onActionClick", "Lkotlin/Function1;", "", "NotesListPreview", "NotesListScreen", "restartApp", "openScreen", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/notes/app/screens/notes_list/NotesListViewModel;", "app_debug"})
public final class NotesListScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @android.annotation.SuppressLint(value = {"UnusedMaterial3ScaffoldPaddingParameter"})
    public static final void NotesListScreen(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> restartApp, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> openScreen, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.notes.app.screens.notes_list.NotesListViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NoteItem(@org.jetbrains.annotations.NotNull
    com.notes.app.model.Note note, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onActionClick) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true, showSystemUi = true)
    @androidx.compose.runtime.Composable
    public static final void NotesListPreview() {
    }
}