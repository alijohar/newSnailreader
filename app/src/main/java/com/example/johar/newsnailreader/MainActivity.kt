package com.example.johar.newsnailreader

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_view.*

class MainActivity : AppCompatActivity() {
    var itemList= ArrayList<Book>()
    var transfer : Adapter? = null
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
        transfer = Adapter(this, itemList)
        listView.adapter = transfer
        infoBook()
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }


    fun infoBook(){

        itemList.add(Book(R.color.abc_btn_colored_text_material, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.color.abc_btn_colored_text_material, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.color.abc_btn_colored_text_material, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.color.abc_btn_colored_text_material, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.color.abc_btn_colored_text_material, "Learning Adobe XD","Learning Adobe XD"))

    }



}
