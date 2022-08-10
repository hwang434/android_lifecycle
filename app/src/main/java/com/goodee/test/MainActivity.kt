package com.goodee.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.goodee.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG: String = "로그"
    }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // savedInstanceState 이전 액티비티에서 담아준 정보
        Log.d(TAG,"MainActivity - onCreate(savedInstanceState = ${savedInstanceState}) called")
        // 화면 xml 파일과 액티비티를 묶어주는 데이터 바인딩
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 화면에 이벤트를 등록
        binding.startNewActBtn.setOnClickListener {
            startSecondActivity()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"MainActivity - onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"MainActivity - onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"MainActivity - onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"MainActivity - onStop() called")
    }


    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"MainActivity - onRestart() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"MainActivity - onDestroy() called")
    }

    private fun startSecondActivity() {
        Log.d(TAG,"MainActivity - startSecondActivity() called")
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("MainActivity Info", "메인 액티비티에서 담아서 보내준 정보")
        startActivity(intent)
    }
}