package com.floadsbjm.floader.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.floadsbjm.floader.R
import com.floadsbjm.floader.databinding.FragmentProfileInformationBinding
import com.floadsbjm.floader.network.BaseRepository
import com.floadsbjm.floader.ui.base.BaseFragment
import com.floadsbjm.floader.ui.viewmodels.ProfileViewModel


class ProfileInformationFragment :
    BaseFragment<ProfileViewModel, FragmentProfileInformationBinding, BaseRepository>() {
    override fun getViewModel(): Class<ProfileViewModel> {
        TODO("Not yet implemented")
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentProfileInformationBinding =
        FragmentProfileInformationBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): BaseRepository {
        TODO("Not yet implemented")
    }

    override fun onResume() {
        super.onResume()
        binding.root.requestLayout()
    }
}