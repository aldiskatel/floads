package com.floadsbjm.floader.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.floadsbjm.floader.databinding.FragmentLoginBinding
import com.floadsbjm.floader.network.AuthRepository
import com.floadsbjm.floader.ui.base.BaseFragment
import com.floadsbjm.floader.ui.viewmodels.AuthViewModel

class  LoginFragment : BaseFragment<AuthViewModel, FragmentLoginBinding, AuthRepository>() {

    override fun getViewModel(): Class<AuthViewModel> = AuthViewModel::class.java

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentLoginBinding = FragmentLoginBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): AuthRepository {
        TODO("Not yet implemented")
    }

}