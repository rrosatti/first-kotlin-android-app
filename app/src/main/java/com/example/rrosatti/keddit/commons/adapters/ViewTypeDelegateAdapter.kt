package com.example.rrosatti.keddit.commons.adapters

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by rrosatti on 9/29/17.
 */
interface ViewTypeDelegateAdapter {

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)

}