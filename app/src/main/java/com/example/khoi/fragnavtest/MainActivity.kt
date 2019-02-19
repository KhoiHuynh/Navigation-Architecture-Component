package com.example.khoi.fragnavtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.ActionBar
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.ncapdevi.fragnav.FragNavController
import com.ncapdevi.fragnav.FragNavTransactionOptions
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
//    private val mapFragment: Fragment = MapFragment()
//    private val hostFragment: Fragment = HostFragment()
//    private val profileFragment: Fragment = ProfileFragment()
//    private val fm = supportFragmentManager
//    private var activeFragment = mapFragment
//    private lateinit var toolbar: ActionBar
//    private val mOnNavigationItemSelectedListener =
//        BottomNavigationView.OnNavigationItemSelectedListener { item ->
//
//            when (item.itemId) {
//            R.id.navigation_map -> {
//                fm.beginTransaction().hide(activeFragment).show(mapFragment).commit()
//                activeFragment = mapFragment
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_host -> {
//                fm.beginTransaction().hide(activeFragment).show(hostFragment).commit()
//                activeFragment = hostFragment
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_profile -> {
//                fm.beginTransaction().hide(activeFragment).show(profileFragment).commit()
//                activeFragment = profileFragment
//                return@OnNavigationItemSelectedListener true
//            }
//        }
//        false
//    }

    private fun setupBottomNavMenu(navController: NavController){
        bottom_nav.let {
            NavigationUI.setupWithNavController(it, navController)
        }
    }

    private fun setupActionBar(navController: NavController){
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(Navigation.findNavController(this, R.id.nav_host_fragment), null)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        setupBottomNavMenu(navController)
        setupActionBar(navController)


//        fm.beginTransaction().add(R.id.container, profileFragment, "profileFragment").hide(profileFragment).commit()
//        fm.beginTransaction().add(R.id.container, hostFragment, "hostFragment").hide(hostFragment).commit()
//        fm.beginTransaction().add(R.id.container, mapFragment, "mapFragment").commit()
//
//        toolbar = supportActionBar!!
//        val bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)
//        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
//
//        //the home Fragment
//        bottomNavigation.selectedItemId = R.id.navigation_map
    }
}
