// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.fly.tour.news.model;

import android.content.Context;
import com.fly.tour.db.dao.NewsDetailDao;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class NewsListModel_Factory implements Factory<NewsListModel> {
  private final Provider<Context> contextProvider;

  private final Provider<NewsDetailDao> detailDaoProvider;

  public NewsListModel_Factory(
      Provider<Context> contextProvider, Provider<NewsDetailDao> detailDaoProvider) {
    this.contextProvider = contextProvider;
    this.detailDaoProvider = detailDaoProvider;
  }

  @Override
  public NewsListModel get() {
    return new NewsListModel(contextProvider.get(), detailDaoProvider.get());
  }

  public static Factory<NewsListModel> create(
      Provider<Context> contextProvider, Provider<NewsDetailDao> detailDaoProvider) {
    return new NewsListModel_Factory(contextProvider, detailDaoProvider);
  }
}
