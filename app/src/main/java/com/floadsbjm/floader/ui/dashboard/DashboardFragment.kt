package com.floadsbjm.floader.ui.dashboard

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.transition.Visibility
import com.floadsbjm.floader.MainActivity
import com.floadsbjm.floader.R
import com.floadsbjm.floader.databinding.FragmentDashboardBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // @TODO: Change this according to app's logic
        binding.mapView.onCreate(savedInstanceState)
        binding.mapView.getMapAsync {
            it.addMarker(
                MarkerOptions()
                    .position(LatLng(-37.813, 144.962))
                    .title("Driver")
                    .icon(bitmapDescriptorFromVector(requireContext(), R.drawable.ic_marker))
            )
            it.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(-37.813, 144.962), 18.0F))
        }

        binding.toogleSwitchStatus.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.tvStatus.text = resources.getText(R.string.tv_status_online)
                binding.apply {
                    tvAskingForOnline.isVisible = false
                    icMoonOffline.isVisible = false
                    tvOfflineState.isVisible = false
                    tvMoreRoutes.isVisible = true
                }

            } else {
                binding.tvStatus.text = resources.getText(R.string.tv_status_offline)
                binding.apply {
                    tvAskingForOnline.isVisible = true
                    icMoonOffline.isVisible = true
                    tvOfflineState.isVisible = true
                    tvMoreRoutes.isVisible = false
                }

            }
        }

        binding.btNavDrawer.setOnClickListener {
            (activity as MainActivity).openCloseNavigationDrawer()
        }

    }

    private fun bitmapDescriptorFromVector(context: Context, vectorResId: Int): BitmapDescriptor? {
        return ContextCompat.getDrawable(context, vectorResId)?.run {
            setBounds(0, 0, intrinsicWidth, intrinsicHeight)
            val bitmap =
                Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888)
            draw(Canvas(bitmap))
            BitmapDescriptorFactory.fromBitmap(bitmap)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.mapView.onDestroy()
        _binding = null
    }

    override fun onStart() {
        super.onStart()
        binding.mapView.onStart()
    }

    override fun onResume() {
        super.onResume()
        binding.mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        binding.mapView.onPause()
    }

    override fun onStop() {
        super.onStop()
        binding.mapView.onStop()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        binding.mapView.onLowMemory()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        binding.mapView.onSaveInstanceState(outState)
    }
}