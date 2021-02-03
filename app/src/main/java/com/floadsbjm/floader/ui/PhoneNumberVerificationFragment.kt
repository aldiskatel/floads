package com.floadsbjm.floader.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.floadsbjm.floader.databinding.FragmentPhoneNumberVerifBinding
import com.floadsbjm.floader.network.BaseRepository
import com.floadsbjm.floader.ui.base.BaseFragment
import com.floadsbjm.floader.ui.viewmodels.RegistrationViewModel


class PhoneNumberVerificationFragment :
    BaseFragment<RegistrationViewModel, FragmentPhoneNumberVerifBinding, BaseRepository>() {
    override fun getViewModel(): Class<RegistrationViewModel> {
        TODO("Not yet implemented")
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPhoneNumberVerifBinding =
        FragmentPhoneNumberVerifBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): BaseRepository {
        TODO("Not yet implemented")
    }


//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        _binding = FragmentPhoneNumberVerifBinding.inflate(inflater, container, false)
//
//        // TODO: IME insets work around for Android 11
//        // Check if Android's version is lower than R
////        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
////            activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
////        } else {
////            activity?.window?.setDecorFitsSystemWindows(false)
////            binding.root.setOnApplyWindowInsetsListener { v, insets ->
////                val myInsets = insets.getInsets(
////                    WindowInsets.Type.ime()
////                )
////                insets
////            }
////        }
//
//        // Inflate the layout for this fragment
//        return binding.root
//    }

}