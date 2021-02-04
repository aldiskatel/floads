package com.floadsbjm.floader.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.floadsbjm.floader.R
import com.floadsbjm.floader.databinding.FragmentRegistrationThreeBinding
import com.floadsbjm.floader.network.BaseRepository
import com.floadsbjm.floader.ui.base.BaseFragment
import com.floadsbjm.floader.ui.viewmodels.RegistrationViewModel

class FragmentRegistrationThree :
    BaseFragment<RegistrationViewModel, FragmentRegistrationThreeBinding, BaseRepository>() {
    override fun getViewModel(): Class<RegistrationViewModel> {
        TODO("Not yet implemented")
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentRegistrationThreeBinding =
        FragmentRegistrationThreeBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): BaseRepository {
        TODO("Not yet implemented")
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ivArrow.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentRegistrationThree_to_fragmentRegistrationTwo)
        }

        binding.btLanjut.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentRegistrationThree_to_phoneNumberVerificationFragment)
        }
    }
}