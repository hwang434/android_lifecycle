package com.goodee.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.goodee.test.databinding.ActivityMainBinding
import kotlinx.coroutines.*
import okhttp3.Dispatcher
import retrofit2.HttpException
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG: String = "로그"
    }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"MainActivity - onCreate() called")
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.startNewActBtn.setOnClickListener {
            startSecondActivity()
        }
    }

    override fun onStart() {
        Log.d(TAG,"MainActivity - onStart() called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"MainActivity - onResume() called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"MainActivity - onPause() called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"MainActivity - onStop() called")
        super.onStop()
    }


    override fun onRestart() {
        Log.d(TAG,"MainActivity - onRestart() called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG,"MainActivity - onDestroy() called")
        super.onDestroy()
    }

    private fun startSecondActivity() {
        Log.d(TAG,"MainActivity - startSecondActivity() called")
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}