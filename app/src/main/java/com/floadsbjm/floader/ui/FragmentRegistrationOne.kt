package com.floadsbjm.floader.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.floadsbjm.floader.databinding.FragmentRegistrationOneBinding
import com.floadsbjm.floader.network.BaseRepository
import com.floadsbjm.floader.ui.base.BaseFragment
import com.floadsbjm.floader.ui.viewmodels.RegistrationViewModel

class FragmentRegistrationOne :
    BaseFragment<RegistrationViewModel, FragmentRegistrationOneBinding, BaseRepository>() {

    override fun getViewModel(): Class<RegistrationViewModel> {
        TODO("Not yet implemented")
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentRegistrationOneBinding =
        FragmentRegistrationOneBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): BaseRepository {
        TODO("Not yet implemented")
    }


}