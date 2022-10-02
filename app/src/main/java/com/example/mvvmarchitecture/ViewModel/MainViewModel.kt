package com.example.mvvmarchitecture.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var result = MutableLiveData<Int>()
    
    // or
//    val currentResult: MutableLiveData<Int> by lazy {
//        MutableLiveData<Int>()
//    }


    fun hasilPenjumlahan(angka1 : Int, angka2 : Int){
        result.value = angka1 + angka2
    }
}