package com.notes.app.model.service.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AccountServiceImpl_Factory implements Factory<AccountServiceImpl> {
  @Override
  public AccountServiceImpl get() {
    return newInstance();
  }

  public static AccountServiceImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AccountServiceImpl newInstance() {
    return new AccountServiceImpl();
  }

  private static final class InstanceHolder {
    private static final AccountServiceImpl_Factory INSTANCE = new AccountServiceImpl_Factory();
  }
}
