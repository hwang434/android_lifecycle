package com.goodee.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.goodee.test.databinding.ActivityMainBinding
import com.goodee.test.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    companion object {
        private const val TAG: String = "로그"
    }
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"SecondActivity - onCreate(savedInstanceState : ${savedInstanceState?.get("MainActivity Info")}) called")
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"SecondActivity - onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"SecondActivity - onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"SecondActivity - onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"SecondActivity - onStop() called")
    }


    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"SecondActivity - onRestart() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"SecondActivity - onDestroy() called")
    }
}