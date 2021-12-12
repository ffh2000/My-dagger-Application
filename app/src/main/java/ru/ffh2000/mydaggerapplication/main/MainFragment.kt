package ru.ffh2000.mydaggerapplication.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import ru.ffh2000.mydaggerapplication.R
import javax.inject.Inject

class MainFragment : Fragment(R.layout.fragment_main) {

    @Inject
    lateinit var viewModel: MainFragmentViewModel

}