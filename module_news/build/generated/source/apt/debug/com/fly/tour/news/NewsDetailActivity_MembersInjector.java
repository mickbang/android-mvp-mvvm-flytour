// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.fly.tour.news;

import com.fly.tour.common.base.BaseMvpActivity_MembersInjector;
import com.fly.tour.news.presenter.NewsDetailPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class NewsDetailActivity_MembersInjector
    implements MembersInjector<NewsDetailActivity> {
  private final Provider<NewsDetailPresenter> mPresenterProvider;

  public NewsDetailActivity_MembersInjector(Provider<NewsDetailPresenter> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<NewsDetailActivity> create(
      Provider<NewsDetailPresenter> mPresenterProvider) {
    return new NewsDetailActivity_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(NewsDetailActivity instance) {
    BaseMvpActivity_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
  }
}
