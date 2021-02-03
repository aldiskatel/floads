package com.floadsbjm.floader.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.floadsbjm.floader.network.BaseRepository

abstract class BaseFragment<VM : ViewModel, B : ViewBinding, R : BaseRepository> : Fragment() {

    private var _binding: B? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = getFragmentBinding(inflater, container)
        return binding.root
    }

    abstract fun getViewModel(): Class<VM>

    abstract fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): B

    abstract fun getFragmentRepository(): R

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}