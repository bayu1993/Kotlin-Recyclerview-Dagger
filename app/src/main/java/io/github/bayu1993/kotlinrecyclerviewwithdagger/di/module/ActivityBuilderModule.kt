package io.github.bayu1993.kotlinrecyclerviewwithdagger.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.bayu1993.kotlinrecyclerviewwithdagger.presentation.ui.MainActivity

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */
@Module
abstract class ActivityBuilderModule{
    @ContributesAndroidInjector
    abstract fun mainActivity():MainActivity
}