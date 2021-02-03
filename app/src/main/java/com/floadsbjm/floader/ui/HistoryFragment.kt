package com.floadsbjm.floader.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import com.floadsbjm.floader.databinding.FragmentHistoryBinding
import com.floadsbjm.floader.network.BaseRepository
import com.floadsbjm.floader.ui.base.BaseFragment
import com.floadsbjm.floader.ui.viewmodels.HistoryViewModel

class HistoryFragment : BaseFragment<HistoryViewModel, FragmentHistoryBinding, BaseRepository>() {
    override fun getViewModel(): Class<HistoryViewModel> {
        TODO("Not yet implemented")
    }

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHistoryBinding = FragmentHistoryBinding.inflate(inflater, container, false)

    override fun getFragmentRepository(): BaseRepository {
        TODO("Not yet implemented")
    }

}