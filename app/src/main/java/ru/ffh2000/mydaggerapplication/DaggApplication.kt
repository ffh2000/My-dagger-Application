package ru.ffh2000.mydaggerapplication

import android.app.Application

class DaggApplication: Application() {

    val appComponent: AppComponent = DaggerAppComponent.create()

}

