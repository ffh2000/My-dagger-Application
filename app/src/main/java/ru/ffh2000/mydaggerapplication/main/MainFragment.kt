package ru.ffh2000.mydaggerapplication.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import ru.ffh2000.mydaggerapplication.R

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}