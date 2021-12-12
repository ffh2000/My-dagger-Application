package ru.ffh2000.mydaggerapplication

//import dagger.Module
//import dagger.Provides
import ru.ffh2000.mydaggerapplication.main.MainFragment

//@Module
class AppModule {
//    @Provides
    fun provideMainFragment() = MainFragment()
}