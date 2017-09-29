package com.example.rrosatti.keddit.commons

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
)