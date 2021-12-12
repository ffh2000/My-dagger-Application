package ru.ffh2000.mydaggerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    /**
     * Данная переменная будет создана путем инжэектированния через Dagger 2
     */
    @Inject
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        // инжектирование в текущий MainActivity
        // всех зависимостей, описанных в AppComponent
        (applicationContext as DaggApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, viewModel.toString(), Toast.LENGTH_LONG).show()
    }
}