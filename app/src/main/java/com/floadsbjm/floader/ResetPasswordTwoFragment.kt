package com.floadsbjm.floader

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.floadsbjm.floader.databinding.FragmentRegistrationTwoBinding
import com.floadsbjm.floader.network.BaseRepository
import com.floadsbjm.floader.ui.base.BaseFragment
import com.floadsbjm.floader.ui.viewmodels.AuthViewModel

class ResetPasswordTwoFragment :
    BaseFragment<AuthViewModel, FragmentRegistrationTwoBinding, BaseRepository>() {
    override fun getViewModel(): Class<AuthViewModel> {
        TODO("Not yet implemented")
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentRegistrationTwoBinding =
        FragmentRegistrationTwoBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): BaseRepository {
        TODO("Not yet implemented")
    }

}