package com.example.pocdontkeepactivitiy

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel : ViewModel() {
    val enteredData = MutableLiveData<String>()

    val dataEntered: LiveData<String> = enteredData

    val someStr: ObservableField<String>? = null

    fun inputData(text: String) {
        enteredData.value = someStr.toString()
        Log.d("aa", someStr?.get().toString())
        Log.d("sss", enteredData.toString())
    }
    fun observeLiveDate(): LiveData<String> {
        return dataEntered
    }
}

// [6:00 pm] Annapurna Podar
//
// [6:00 pm] Annapurna Podar
// in xml put  android:text="@={model.someStr}"
