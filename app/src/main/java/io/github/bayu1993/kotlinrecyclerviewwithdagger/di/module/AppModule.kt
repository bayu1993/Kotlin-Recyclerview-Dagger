package io.github.bayu1993.kotlinrecyclerviewwithdagger.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */
@Module
class AppModule{
    @Provides
    fun provideAppContext(app:Application):Context= app.applicationContext
}