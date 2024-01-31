package com.notes.app.screens.notes_list;

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
public final class NotesListViewModel_Factory implements Factory<NotesListViewModel> {
  private final Provider<AccountService> accountServiceProvider;

  private final Provider<StorageService> storageServiceProvider;

  public NotesListViewModel_Factory(Provider<AccountService> accountServiceProvider,
      Provider<StorageService> storageServiceProvider) {
    this.accountServiceProvider = accountServiceProvider;
    this.storageServiceProvider = storageServiceProvider;
  }

  @Override
  public NotesListViewModel get() {
    return newInstance(accountServiceProvider.get(), storageServiceProvider.get());
  }

  public static NotesListViewModel_Factory create(Provider<AccountService> accountServiceProvider,
      Provider<StorageService> storageServiceProvider) {
    return new NotesListViewModel_Factory(accountServiceProvider, storageServiceProvider);
  }

  public static NotesListViewModel newInstance(AccountService accountService,
      StorageService storageService) {
    return new NotesListViewModel(accountService, storageService);
  }
}
