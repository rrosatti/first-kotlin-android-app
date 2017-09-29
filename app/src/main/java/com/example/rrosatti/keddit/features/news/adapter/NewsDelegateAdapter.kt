package com.example.rrosatti.keddit.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.rrosatti.keddit.R
import com.example.rrosatti.keddit.commons.RedditNewsItem
import com.example.rrosatti.keddit.commons.adapters.ViewType
import com.example.rrosatti.keddit.commons.adapters.ViewTypeDelegateAdapter
import com.example.rrosatti.keddit.commons.extensions.getFriendlyTime
import com.example.rrosatti.keddit.commons.extensions.inflate
import com.example.rrosatti.keddit.commons.extensions.loadImg
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * Created by rrosatti on 9/29/17.
 */
class NewsDelegateAdapter : ViewTypeDelegateAdapter {


    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHelper(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHelper
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHelper(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            imgThumbnail.loadImg(item.thumbnail)
            txtDescription.text = item.title
            txtAuthor.text = item.author
            txtComments.text = "${item.numComments} comments"
            txtTime.text = item.created.getFriendlyTime()
        }

    }

}