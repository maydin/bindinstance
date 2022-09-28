package com.murat.bindinstance.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.murat.bindinstance.MyApplication
import com.murat.bindinstance.R
import com.murat.feature.Printer
import com.murat.logger.Logger
import javax.inject.Inject

class MainFragment : Fragment() {

    @Inject
    lateinit var printer: Printer

    @Inject
    lateinit var logger: Logger

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val app = requireActivity().application as MyApplication
        app.component.inject(this)
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.button).setOnClickListener {
            printer.printPackageName()
            logger.printPackageName()
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }

}