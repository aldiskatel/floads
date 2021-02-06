package com.floadsbjm.floader.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.floadsbjm.floader.R
import com.floadsbjm.floader.databinding.FragmentLoginBinding
import com.floadsbjm.floader.network.AuthRepository
import com.floadsbjm.floader.ui.base.BaseFragment
import com.floadsbjm.floader.ui.viewmodels.AuthViewModel
import com.floadsbjm.floader.utils.snackBar

class  LoginFragment : BaseFragment<AuthViewModel, FragmentLoginBinding, AuthRepository>() {

    override fun getViewModel(): Class<AuthViewModel> = AuthViewModel::class.java

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentLoginBinding = FragmentLoginBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): AuthRepository {
        TODO("Not yet implemented")
    }

    /**
     * Below code is for testing purpose only.
     * - Add Navigation to certain fragments
     * - Add SnackBar
     * - No Authentication yet
     */

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // Button is pressed, go to dashboard (no authentication yet)
        binding.btMasuk.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_dashboardFragment)
        }

        binding.btFacebookLogin.setOnClickListener {
            binding.root.snackBar("Facebook Login")
        }

        binding.tvResetPassword.setOnClickListener {
            // Navigates to Forgot Password Page
            findNavController().navigate(R.id.action_loginFragment_to_resetPasswordOneFragment)
        }

        binding.tvDaftar.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_fragmentRegistrationOne)
        }
    }
}