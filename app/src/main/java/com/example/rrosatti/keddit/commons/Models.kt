package com.example.rrosatti.keddit.commons

import com.example.rrosatti.keddit.commons.adapters.AdapterConstants
import com.example.rrosatti.keddit.commons.adapters.ViewType

/**
 * Created by rrosatti on 9/29/17.
 */
data class RedditNewsItem (
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}