package com.notes.app.screens.sign_up;

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
public final class SignUpViewModel_Factory implements Factory<SignUpViewModel> {
  private final Provider<AccountService> accountServiceProvider;

  public SignUpViewModel_Factory(Provider<AccountService> accountServiceProvider) {
    this.accountServiceProvider = accountServiceProvider;
  }

  @Override
  public SignUpViewModel get() {
    return newInstance(accountServiceProvider.get());
  }

  public static SignUpViewModel_Factory create(Provider<AccountService> accountServiceProvider) {
    return new SignUpViewModel_Factory(accountServiceProvider);
  }

  public static SignUpViewModel newInstance(AccountService accountService) {
    return new SignUpViewModel(accountService);
  }
}
