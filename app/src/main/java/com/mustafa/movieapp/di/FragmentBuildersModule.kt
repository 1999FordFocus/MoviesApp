package com.mustafa.movieapp.di

import com.mustafa.movieapp.view.ui.search.MovieSearchFragment
import com.mustafa.movieapp.view.ui.movies.moviedetail.MovieDetailFragment
import com.mustafa.movieapp.view.ui.movies.movielist.MovieListFragment
import com.mustafa.movieapp.view.ui.search.filter.MovieSearchResultFilterFragment
import com.mustafa.movieapp.view.ui.search.result.MovieSearchResultFragment
import com.mustafa.movieapp.view.ui.search.result.TvSearchResultFragment
import com.mustafa.movieapp.view.ui.person.celebrities.CelebritiesListFragment
import com.mustafa.movieapp.view.ui.person.detail.CelebrityDetailFragment
import com.mustafa.movieapp.view.ui.person.detail.MoviePersonDetailFragment
import com.mustafa.movieapp.view.ui.person.detail.TvPersonDetailFragment
import com.mustafa.movieapp.view.ui.search.TvSearchFragment
import com.mustafa.movieapp.view.ui.search.filter.TvSearchResultFilterFragment
import com.mustafa.movieapp.view.ui.tv.tvdetail.TvDetailFragment
import com.mustafa.movieapp.view.ui.tv.tvlist.TvListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeMovieListFragment(): MovieListFragment

    @ContributesAndroidInjector
    abstract fun contributeMovieDetailFragment(): MovieDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeTvDetailFragment(): TvDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeTvListFragment(): TvListFragment

    @ContributesAndroidInjector
    abstract fun contributeCelebritiesListFragment(): CelebritiesListFragment

    @ContributesAndroidInjector
    abstract fun contributeCelebrityDetailFragment(): CelebrityDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeMoviesSearchFragment(): MovieSearchFragment

    @ContributesAndroidInjector
    abstract fun contributeTvSearchFragment(): TvSearchFragment

    @ContributesAndroidInjector
    abstract fun contributeSearchResultFragment(): MovieSearchResultFragment

    @ContributesAndroidInjector
    abstract fun contributeTvSearchResultFragment(): TvSearchResultFragment

    @ContributesAndroidInjector
    abstract fun contributeMovieSearchResultFilterFragment(): MovieSearchResultFilterFragment

    @ContributesAndroidInjector
    abstract fun contributeTvSearchResultFilterFragment(): TvSearchResultFilterFragment

    @ContributesAndroidInjector
    abstract fun contributeMoviePersonDetailFragment(): MoviePersonDetailFragment

    @ContributesAndroidInjector
    abstract fun contributeTvPersonDetailFragment(): TvPersonDetailFragment
}