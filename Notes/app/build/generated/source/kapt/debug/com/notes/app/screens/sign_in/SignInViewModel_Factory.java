package com.notes.app.screens.sign_in;

import com.notes.app.model.service.AccountService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignInViewModel_Factory implements Factory<SignInViewModel> {
  private final Provider<AccountService> accountServiceProvider;

  public SignInViewModel_Factory(Provider<AccountService> accountServiceProvider) {
    this.accountServiceProvider = accountServiceProvider;
  }

  @Override
  public SignInViewModel get() {
    return newInstance(accountServiceProvider.get());
  }

  public static SignInViewModel_Factory create(Provider<AccountService> accountServiceProvider) {
    return new SignInViewModel_Factory(accountServiceProvider);
  }

  public static SignInViewModel newInstance(AccountService accountService) {
    return new SignInViewModel(accountService);
  }
}
