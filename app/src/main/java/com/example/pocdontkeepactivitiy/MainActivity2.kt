package com.example.pocdontkeepactivitiy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.pocdontkeepactivitiy.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    val fragmentViewModel = FragmentViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        fragmentViewModel.observeLiveDate().observe(
            this,
            Observer {
                binding.textView2.setText(it)
            }
        )
    }
}
