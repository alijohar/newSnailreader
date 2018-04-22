package com.example.johar.newsnailreader

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_my_library -> {
                message.setText(R.string.title_my_library)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_features -> {
                message.setText(R.string.title_features)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_categories -> {
                message.setText(R.string.title_categories)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

}
