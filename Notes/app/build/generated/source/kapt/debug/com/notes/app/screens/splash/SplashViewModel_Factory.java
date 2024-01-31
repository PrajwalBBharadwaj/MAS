package com.notes.app.screens.splash;

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
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<AccountService> accountServiceProvider;

  public SplashViewModel_Factory(Provider<AccountService> accountServiceProvider) {
    this.accountServiceProvider = accountServiceProvider;
  }

  @Override
  public SplashViewModel get() {
    return newInstance(accountServiceProvider.get());
  }

  public static SplashViewModel_Factory create(Provider<AccountService> accountServiceProvider) {
    return new SplashViewModel_Factory(accountServiceProvider);
  }

  public static SplashViewModel newInstance(AccountService accountService) {
    return new SplashViewModel(accountService);
  }
}
