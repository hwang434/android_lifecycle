package com.goodee.test

import android.content.Context
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.goodee.test.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    companion object {
        private const val TAG: String = "로그"
    }
    private lateinit var binding: FragmentSecondBinding

    override fun onAttach(context: Context) {
        Log.d(TAG,"SecondFragment - onAttach() called")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"SecondFragment - onCreate() called")
        // 이벤트 등록
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // 뷰모델 초기화
        Log.d(TAG,"SecondFragment - onCreateView() called")
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG,"SecondFragment - onViewCreated() called")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d(TAG,"SecondFragment - onViewStateRestored() called")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"SecondFragment - onStart() called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"SecondFragment - onResume() called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"SecondFragment - onPause() called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"SecondFragment - onStop() called")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG,"SecondFragment - onSaveInstanceState() called")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.d(TAG,"SecondFragment - onDestroyView() called")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG,"SecondFragment - onDestroy() called")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG,"SecondFragment - onDetach() called")
        super.onDetach()
    }
}