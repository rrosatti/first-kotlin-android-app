package com.example.rrosatti.keddit.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.rrosatti.keddit.R
import com.example.rrosatti.keddit.commons.adapters.ViewType
import com.example.rrosatti.keddit.commons.adapters.ViewTypeDelegateAdapter
import com.example.rrosatti.keddit.commons.extensions.inflate

/**
 * Created by rrosatti on 9/29/17.
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHelper(parent)


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {

    }

    class TurnsViewHelper(parent: ViewGroup): RecyclerView.ViewHolder (
            parent.inflate(R.layout.news_item_loading)) {
    }

}