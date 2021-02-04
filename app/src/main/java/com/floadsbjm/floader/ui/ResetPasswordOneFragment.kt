package com.floadsbjm.floader.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.floadsbjm.floader.databinding.FragmentResetPasswordOneBinding
import com.floadsbjm.floader.network.BaseRepository
import com.floadsbjm.floader.ui.base.BaseFragment
import com.floadsbjm.floader.ui.viewmodels.AuthViewModel


class ResetPasswordOneFragment :
    BaseFragment<AuthViewModel, FragmentResetPasswordOneBinding, BaseRepository>() {
    override fun getViewModel(): Class<AuthViewModel> {
        TODO("Not yet implemented")
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentResetPasswordOneBinding =
        FragmentResetPasswordOneBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): BaseRepository {
        TODO("Not yet implemented")
    }

}