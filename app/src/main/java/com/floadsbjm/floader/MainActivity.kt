package com.floadsbjm.floader

import android.annotation.SuppressLint
import android.graphics.Rect
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.floadsbjm.floader.databinding.ActivityMainBinding
import com.floadsbjm.floader.ui.dashboard.NavDrawerAdapter
import com.floadsbjm.floader.ui.dashboard.NavigationDrawerItemModel
import com.floadsbjm.floader.utils.hideKeyboard
import com.floadsbjm.floader.utils.snackBar

@SuppressLint("ClickableViewAccessibility")
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var drawerLayout: DrawerLayout
    private lateinit var adapter: NavDrawerAdapter

    private var items = arrayListOf(
        NavigationDrawerItemModel(1, R.drawable.ic_home, "Home"),
        NavigationDrawerItemModel(2, R.drawable.ic_wallet, "Dompet Ku"),
        NavigationDrawerItemModel(3, R.drawable.ic_history, "History"),
        NavigationDrawerItemModel(4, R.drawable.ic_setting, "Pengaturan"),
        NavigationDrawerItemModel(5, R.drawable.ic_logout, "Logout"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        drawerLayout = binding.drawerLayout

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.dashboardFragment,
                R.id.profileFragment,
                R.id.historyFragment -> setDrawerLocked(false)
                else -> setDrawerLocked(true)
            }
        }

        initRecyclerView()
        updateAdapter(navController)

    }

    private fun initRecyclerView() {
        binding.rvDrawerMenu.apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }
    }

    private fun updateAdapter(navController: NavController) {
        adapter = NavDrawerAdapter(items)
        binding.rvDrawerMenu.adapter = adapter

        // @TODO: Change SnackBars to actual navigation
        // @TODO: Lock certain nav drawer for certain fragments
        // @TODO: Might want to add highlight on selected row
        adapter.setOnItemClickListener {
            when (it.id) {
                1 -> {
                    navController.navigate(R.id.dashboardFragment)
                    openCloseNavigationDrawer()
                }
                2 -> binding.root.snackBar("Payment is selected")
                3 -> {
                    navController.navigate(R.id.historyFragment)
                    openCloseNavigationDrawer()
                }
                4 -> binding.root.snackBar("Pengaturan is selected")
                5 -> binding.root.snackBar("Logout is selected")
            }
        }
    }

    private fun setDrawerLocked(enabled: Boolean) {
        if (enabled) {
            drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        } else {
            drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
        }
    }

    fun openCloseNavigationDrawer() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        if (ev?.action == MotionEvent.ACTION_DOWN) {
            val v = currentFocus
            if (v is EditText) {
                val outRect = Rect()
                v.getGlobalVisibleRect(outRect)
                if (!outRect.contains(ev.rawX.toInt(), ev.rawY.toInt())) {
                    v.clearFocus()
                    v.hideKeyboard()
                }
            }
        }
        return super.dispatchTouchEvent(ev)
    }
}