package ru.ffh2000.mydaggerapplication

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
abstract class AppComponent {

    /**
     * Функция инжектирования в заданный activity всех его зависимостей,
     * объявленных в нем через @Inject
     */
    abstract fun inject(activity: MainActivity)
}