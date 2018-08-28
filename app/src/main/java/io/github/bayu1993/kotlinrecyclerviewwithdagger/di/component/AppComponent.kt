package io.github.bayu1993.kotlinrecyclerviewwithdagger.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import io.github.bayu1993.kotlinrecyclerviewwithdagger.BaseApp
import io.github.bayu1993.kotlinrecyclerviewwithdagger.di.module.ActivityBuilderModule
import io.github.bayu1993.kotlinrecyclerviewwithdagger.di.module.AppModule
import io.github.bayu1993.kotlinrecyclerviewwithdagger.di.module.NetworkModule
import io.github.bayu1993.kotlinrecyclerviewwithdagger.di.module.RepoModule
import javax.inject.Singleton

/**
 * Created by Bayu teguh pamuji on 8/27/18.
 * email : bayuteguhpamuji@gmail.com.
 */

@Singleton
@Component(modules = [
    ActivityBuilderModule::class,
    AppModule::class,
    NetworkModule::class,
    RepoModule::class])
interface AppComponent{
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(app:Application): Builder
        fun build(): AppComponent
    }

    fun inject(baseApp:BaseApp)
}