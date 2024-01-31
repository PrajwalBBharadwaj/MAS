package com.notes.app.model.service.impl;

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
public final class StorageServiceImpl_Factory implements Factory<StorageServiceImpl> {
  private final Provider<AccountService> authProvider;

  public StorageServiceImpl_Factory(Provider<AccountService> authProvider) {
    this.authProvider = authProvider;
  }

  @Override
  public StorageServiceImpl get() {
    return newInstance(authProvider.get());
  }

  public static StorageServiceImpl_Factory create(Provider<AccountService> authProvider) {
    return new StorageServiceImpl_Factory(authProvider);
  }

  public static StorageServiceImpl newInstance(AccountService auth) {
    return new StorageServiceImpl(auth);
  }
}
