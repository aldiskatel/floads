package com.floadsbjm.driver.ui

import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.floadsbjm.driver.R
import com.floadsbjm.driver.databinding.FragmentPhoneNumberVerifBinding


class PhoneNumberVerificationFragment : Fragment() {

    private var _binding: FragmentPhoneNumberVerifBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPhoneNumberVerifBinding.inflate(inflater, container, false)

        // TODO: IME insets work around for Android 11
        // Check if Android's version is lower than R
//        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
//            activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
//        } else {
//            activity?.window?.setDecorFitsSystemWindows(false)
//            binding.root.setOnApplyWindowInsetsListener { v, insets ->
//                val myInsets = insets.getInsets(
//                    WindowInsets.Type.ime()
//                )
//                insets
//            }
//        }

        // Inflate the layout for this fragment
        return binding.root
    }

}