package com.example.johar.newsnailreader.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.OrientationHelper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.johar.newsnailreader.BookCategoris
import com.example.johar.newsnailreader.BookCategorisAdapter
import com.example.johar.newsnailreader.R
import com.example.papyrus.recyclerview.BookFeatures
import kotlinx.android.synthetic.main.fragment_categoris.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class categoris : Fragment() {
    var infoBookHistory = ArrayList<BookCategoris>()
    var infoBookArt = ArrayList<BookCategoris>()
    var infoBookFiction = ArrayList<BookCategoris>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categoris, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        CategoriArtRecyclerView.layoutManager = LinearLayoutManager(context, OrientationHelper.HORIZONTAL,false)
        CategoriArtRecyclerView.adapter=BookCategorisAdapter(infoBookArt)
        CategoriFictionRecyclerView.layoutManager = LinearLayoutManager(context, OrientationHelper.HORIZONTAL,false)
        CategoriFictionRecyclerView.adapter =BookCategorisAdapter(infoBookFiction)
        CategoriHistoryRecyclerView.layoutManager = LinearLayoutManager(context, OrientationHelper.HORIZONTAL,false)
        CategoriHistoryRecyclerView.adapter =BookCategorisAdapter(infoBookHistory)
        loadInfoBookArt()
        loadInfoBookFiction()
        loadInfoBookHistory()
    }

    fun loadInfoBookHistory() {
        infoBookHistory.add(BookCategoris(R.drawable.cover_book_test1, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookHistory.add(BookCategoris(R.drawable.cover_book_test1, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookHistory.add(BookCategoris(R.drawable.cover_book_test1, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookHistory.add(BookCategoris(R.drawable.cover_book_test1, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookHistory.add(BookCategoris(R.drawable.cover_book_test1, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookHistory.add(BookCategoris(R.drawable.cover_book_test2, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookHistory.add(BookCategoris(R.drawable.cover_book_test2, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookHistory.add(BookCategoris(R.drawable.cover_book_test2, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookHistory.add(BookCategoris(R.drawable.cover_book_test2, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookHistory.add(BookCategoris(R.drawable.cover_book_test2, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookHistory.add(BookCategoris(R.drawable.cover_book_test2, "Learning Adobe XD", "Learning Adobe XD"))
    }
    fun loadInfoBookArt() {
        infoBookArt.add(BookCategoris(R.drawable.cover_book_test4, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookArt.add(BookCategoris(R.drawable.cover_book_test4, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookArt.add(BookCategoris(R.drawable.cover_book_test4, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookArt.add(BookCategoris(R.drawable.cover_book_test4, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookArt.add(BookCategoris(R.drawable.cover_book_test4, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookArt.add(BookCategoris(R.drawable.cover_book_test4, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookArt.add(BookCategoris(R.drawable.cover_book_test4, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookArt.add(BookCategoris(R.drawable.cover_book_test4, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookArt.add(BookCategoris(R.drawable.cover_book_test4, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookArt.add(BookCategoris(R.drawable.cover_book_test4, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookArt.add(BookCategoris(R.drawable.cover_book_test4, "Learning Adobe XD", "Learning Adobe XD"))
    }
    fun loadInfoBookFiction() {
        infoBookFiction.add(BookCategoris(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookFiction.add(BookCategoris(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookFiction.add(BookCategoris(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookFiction.add(BookCategoris(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookFiction.add(BookCategoris(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookFiction.add(BookCategoris(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookFiction.add(BookCategoris(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookFiction.add(BookCategoris(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookFiction.add(BookCategoris(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookFiction.add(BookCategoris(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
        infoBookFiction.add(BookCategoris(R.drawable.cover_book_test3, "Learning Adobe XD", "Learning Adobe XD"))
    }

}
