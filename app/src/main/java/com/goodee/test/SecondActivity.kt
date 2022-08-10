package com.goodee.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.goodee.test.databinding.ActivityMainBinding

class SecondActivity : AppCompatActivity() {
    companion object {
        private const val TAG: String = "로그"
    }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"SecondActivity - onCreate() called")
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
    }

    override fun onStart() {
        Log.d(TAG,"SecondActivity - onStart() called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"SecondActivity - onResume() called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"SecondActivity - onPause() called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"SecondActivity - onStop() called")
        super.onStop()
    }


    override fun onRestart() {
        Log.d(TAG,"SecondActivity - onRestart() called")
        super.onRestart()
    }

    override fun onDestroy() {
        Log.d(TAG,"SecondActivity - onDestroy() called")
        super.onDestroy()
    }
}