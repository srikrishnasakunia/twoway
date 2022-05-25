package com.example.pocdontkeepactivitiy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.pocdontkeepactivitiy.databinding.FragmentViewBinding

class FragmentView : Fragment() {
    var binding: FragmentViewBinding? = null
    private lateinit var viewModel: FragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null)
            binding?.textView?.setText(savedInstanceState?.getString("text", null).toString())
        viewModel = ViewModelProvider(this).get(FragmentViewModel::class.java)
        binding?.viewModel = viewModel
        binding?.lifecycleOwner = this
        viewModel.inputData(binding?.textView.toString())
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("text", binding?.textView.toString())
    }
}
