package com.notes.app.screens.sign_up;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u000e\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/notes/app/screens/sign_up/SignUpViewModel;", "Lcom/notes/app/screens/NotesAppViewModel;", "accountService", "Lcom/notes/app/model/service/AccountService;", "(Lcom/notes/app/model/service/AccountService;)V", "confirmPassword", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "getConfirmPassword", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "email", "getEmail", "password", "getPassword", "onSignUpClick", "", "openAndPopUp", "Lkotlin/Function2;", "updateConfirmPassword", "newConfirmPassword", "updateEmail", "newEmail", "updatePassword", "newPassword", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SignUpViewModel extends com.notes.app.screens.NotesAppViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.notes.app.model.service.AccountService accountService = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> email = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> password = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> confirmPassword = null;
    
    @javax.inject.Inject
    public SignUpViewModel(@org.jetbrains.annotations.NotNull
    com.notes.app.model.service.AccountService accountService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getConfirmPassword() {
        return null;
    }
    
    public final void updateEmail(@org.jetbrains.annotations.NotNull
    java.lang.String newEmail) {
    }
    
    public final void updatePassword(@org.jetbrains.annotations.NotNull
    java.lang.String newPassword) {
    }
    
    public final void updateConfirmPassword(@org.jetbrains.annotations.NotNull
    java.lang.String newConfirmPassword) {
    }
    
    public final void onSignUpClick(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> openAndPopUp) {
    }
}