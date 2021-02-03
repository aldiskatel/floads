package com.floadsbjm.floader.ui

import android.animation.ValueAnimator
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.floadsbjm.floader.R
import com.floadsbjm.floader.databinding.FragmentProfileBinding
import com.floadsbjm.floader.network.BaseRepository
import com.floadsbjm.floader.ui.adapter.ViewPagerAdapter
import com.floadsbjm.floader.ui.base.BaseFragment
import com.floadsbjm.floader.ui.viewmodels.ProfileViewModel
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ProfileFragment : BaseFragment<ProfileViewModel, FragmentProfileBinding, BaseRepository>() {
    override fun getViewModel(): Class<ProfileViewModel> {
        TODO("Not yet implemented")
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentProfileBinding = FragmentProfileBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): BaseRepository {
        TODO("Not yet implemented")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Fragments List for Tab Layout
        val fragmentList = arrayListOf<Fragment>(
            ProfileInformationFragment(),
            ProfileVehicleFragment()
        )

        // Instantiate the ViewPagerAdapter
        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.profileViewPager.adapter = adapter

        TabLayoutMediator(binding.profileTabLayout, binding.profileViewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Information"
                1 -> tab.text = "Kendaraan"
            }
        }.attach()

        // Handling different tabs
        binding.profileTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab?.position) {
                    0 -> {
                        binding.apply {
                            ivLineOne.setImageResource(R.drawable.ic_line_filled)
                            ivLineTwo.setImageResource(R.drawable.ic_line_unfilled)
                        }
                    }
                    1 -> binding.apply {
                        ivLineOne.setImageResource(R.drawable.ic_line_unfilled)
                        ivLineTwo.setImageResource(R.drawable.ic_line_filled)
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

    }

}