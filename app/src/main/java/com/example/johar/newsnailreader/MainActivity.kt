package com.example.johar.newsnailreader

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import com.example.johar.newsnailreader.fragments.categoris
import com.example.johar.newsnailreader.fragments.features
import com.example.johar.newsnailreader.fragments.myLibrary
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.book_list_view.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    var itemList= ArrayList<Book>()
    var transfer : BookAdapter? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val fragment: Fragment
        when (item.itemId) {
            R.id.navigation_my_library -> {
                fragment = myLibrary()
                loadFragment(fragment)

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_features -> {

                fragment = features()
                loadFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_categories -> {
                fragment = categoris()
                loadFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        floating_search_view.attachNavigationDrawerToMenuButton(drawer_layout)

        transfer = BookAdapter(this, itemList)
        bookListView.adapter = transfer
        infoBook()
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.main, menu)
//        return true
//    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        when (item.itemId) {
//            R.id.action_settings -> return true
//            else -> return super.onOptionsItemSelected(item)
//        }
//    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }




    fun infoBook(){
        itemList.add(Book(R.drawable.cover_book_test2, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.drawable.cover_book_test, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.drawable.cover_book_test2, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.drawable.cover_book_test, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.drawable.cover_book_test2, "Learning Adobe XD","Learning Adobe XD"))
    }

    fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
