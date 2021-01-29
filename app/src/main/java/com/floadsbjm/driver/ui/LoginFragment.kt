package com.floadsbjm.driver.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.floadsbjm.driver.databinding.FragmentLoginBinding
import com.floadsbjm.driver.network.AuthRepository
import com.floadsbjm.driver.ui.auth.AuthViewModel
import com.floadsbjm.driver.ui.base.BaseFragment

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