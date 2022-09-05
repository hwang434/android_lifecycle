package com.goodee.test

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.goodee.test.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    companion object {
        private const val TAG: String = "로그"
    }

    private lateinit var binding: FragmentHomeBinding

    override fun onAttach(context: Context) {
        Log.d(TAG,"HomeFragment - onAttach() called")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"HomeFragment - onCreate() called")
        // 이벤트 등록
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // 뷰모델 초기화
        Log.d(TAG,"HomeFragment - onCreateView() called")
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        binding.buttonToNextFragment.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }
        return binding.root
    }

    override fun onStart() {
        Log.d(TAG,"HomeFragment - onStart() called")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"HomeFragment - onResume() called")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"HomeFragment - onPause() called")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"HomeFragment - onStop() called")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG,"HomeFragment - onDestroyView() called")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG,"HomeFragment - onDestroy() called")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG,"HomeFragment - onDetach() called")
        super.onDetach()
    }
}