package com.example.mvvmarchitecture.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmarchitecture.R
import com.example.mvvmarchitecture.ViewModel.MainViewModel
import com.example.mvvmarchitecture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding : ActivityMainBinding
    private lateinit var viewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.result.observe(this){
            viewBinding.result.text = it.toString()
        }
        viewBinding.button.setOnClickListener {
            val angka1 = viewBinding.editTextTextPersonName.text.toString()
            val angka2 = viewBinding.editTextTextPersonName2.text.toString()
            viewModel.hasilPenjumlahan(angka1.toInt(), angka2.toInt())


        }
    }
}