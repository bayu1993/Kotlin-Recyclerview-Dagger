package io.github.bayu1993.kotlinrecyclerviewwithdagger.di.module

import dagger.Module
import dagger.Provides
import io.github.bayu1993.kotlinrecyclerviewwithdagger.data.repo.ClubRepo
import io.github.bayu1993.kotlinrecyclerviewwithdagger.data.repo.ClubRepoImpl
import javax.inject.Singleton

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */
@Module
class RepoModule{
    @Provides
    @Singleton
    fun provideRepoModule(repoImpl: ClubRepoImpl):ClubRepo = repoImpl
}