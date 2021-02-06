package com.floadsbjm.floader

import android.view.LayoutInflater
import android.view.ViewGroup
import com.floadsbjm.floader.databinding.FragmentEditProfileDocumentsBinding
import com.floadsbjm.floader.network.BaseRepository
import com.floadsbjm.floader.ui.base.BaseFragment
import com.floadsbjm.floader.ui.viewmodels.ProfileViewModel

class EditProfileDocumentsFragment :
    BaseFragment<ProfileViewModel, FragmentEditProfileDocumentsBinding, BaseRepository>() {
    override fun getViewModel(): Class<ProfileViewModel> {
        TODO("Not yet implemented")
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentEditProfileDocumentsBinding = FragmentEditProfileDocumentsBinding.inflate(
        inflater, container, false
    )

    override fun getFragmentRepository(): BaseRepository {
        TODO("Not yet implemented")
    }

}