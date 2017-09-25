package com.example.rrosatti.keddit.features.news

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rrosatti.keddit.R
import com.example.rrosatti.keddit.commons.extensions.inflate

/**
 * Created by rrosatti on 9/24/17.
 */
class NewsFragment : Fragment() {

    private var newsList: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = container?.inflate(R.layout.news_fragment)
        newsList = view?.findViewById<RecyclerView>(R.id.news_list) as RecyclerView?
        newsList?.setHasFixedSize(true) // it is used to improve performance
        newsList?.layoutManager = LinearLayoutManager(context)

        return view
    }

}