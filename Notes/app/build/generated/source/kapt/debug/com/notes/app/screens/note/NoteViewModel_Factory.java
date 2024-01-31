package com.notes.app.screens.note;

import com.notes.app.model.service.AccountService;
import com.notes.app.model.service.StorageService;
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
public final class NoteViewModel_Factory implements Factory<NoteViewModel> {
  private final Provider<AccountService> accountServiceProvider;

  private final Provider<StorageService> storageServiceProvider;

  public NoteViewModel_Factory(Provider<AccountService> accountServiceProvider,
      Provider<StorageService> storageServiceProvider) {
    this.accountServiceProvider = accountServiceProvider;
    this.storageServiceProvider = storageServiceProvider;
  }

  @Override
  public NoteViewModel get() {
    return newInstance(accountServiceProvider.get(), storageServiceProvider.get());
  }

  public static NoteViewModel_Factory create(Provider<AccountService> accountServiceProvider,
      Provider<StorageService> storageServiceProvider) {
    return new NoteViewModel_Factory(accountServiceProvider, storageServiceProvider);
  }

  public static NoteViewModel newInstance(AccountService accountService,
      StorageService storageService) {
    return new NoteViewModel(accountService, storageService);
  }
}
