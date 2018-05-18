package com.example.johar.newsnailreader.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.OrientationHelper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.johar.newsnailreader.R
import com.example.papyrus.recyclerview.BanerFeatures
import com.example.papyrus.recyclerview.BanerFeaturesAdapter
import com.example.papyrus.recyclerview.BookFeatures
import com.example.papyrus.recyclerview.BookFeaturesAdapter
import kotlinx.android.synthetic.main.fragment_features.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class features : Fragment() {
    var infoBook = ArrayList<BookFeatures>()
    var infoBaner = ArrayList<BanerFeatures>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_features, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bookRecyclerView.layoutManager = LinearLayoutManager(context, OrientationHelper.HORIZONTAL, false)
        bookRecyclerView.adapter = BookFeaturesAdapter(infoBook)
        bookRecyclerView2.layoutManager = LinearLayoutManager(context, OrientationHelper.HORIZONTAL, false)
        bookRecyclerView2.adapter = BookFeaturesAdapter(infoBook)
        banerRecyclerView.layoutManager = LinearLayoutManager(context, OrientationHelper.HORIZONTAL, false)
        banerRecyclerView.adapter = BanerFeaturesAdapter(infoBaner)
        loadInfoBook()
        loadInfoBaner()


    }

    fun loadInfoBook() {
        infoBook.add(BookFeatures(R.drawable.cover_book_test1, "Learning Adobe XD", "Learning Adobe XD"))
        infoBook.add(BookFeatures(R.drawable.cover_book_test2, "Learning Adobe XD", "Learning Adobe XD"))
        infoBook.add(BookFeatures(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBook.add(BookFeatures(R.drawable.cover_book_test1, "Learning Adobe XD", "Learning Adobe XD"))
        infoBook.add(BookFeatures(R.drawable.cover_book_test2, "Learning Adobe XD", "Learning Adobe XD"))
        infoBook.add(BookFeatures(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBook.add(BookFeatures(R.drawable.cover_book_test1, "Learning Adobe XD", "Learning Adobe XD"))
        infoBook.add(BookFeatures(R.drawable.cover_book_test2, "Learning Adobe XD", "Learning Adobe XD"))
        infoBook.add(BookFeatures(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBook.add(BookFeatures(R.drawable.cover_book_test1, "Learning Adobe XD", "Learning Adobe XD"))
        infoBook.add(BookFeatures(R.drawable.cover_book_test2, "Learning Adobe XD", "Learning Adobe XD"))
    }

    fun loadInfoBaner() {
        infoBaner.add(BanerFeatures(R.drawable.baner1))
        infoBaner.add(BanerFeatures(R.drawable.baner2))
        infoBaner.add(BanerFeatures(R.drawable.baner1))
        infoBaner.add(BanerFeatures(R.drawable.baner2))
        infoBaner.add(BanerFeatures(R.drawable.baner1))
        infoBaner.add(BanerFeatures(R.drawable.baner2))


    }

}
