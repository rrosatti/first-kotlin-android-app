package com.example.rrosatti.keddit.features.news

import com.example.rrosatti.keddit.commons.RedditNewsItem
import rx.Observable

/**
 * Created by rrosatti on 9/30/17.
 */
class NewsManager() {
    fun getNews(): Observable<List<RedditNewsItem>> {
        return Observable.create {
            subscriber ->

            val news = mutableListOf<RedditNewsItem>()
            for (i in 1..10) {
                news.add(RedditNewsItem(
                        "author$i",
                        "Title $i",
                        i,
                        1457207701L - i * 200,
                        "http://lorempixel.com/200/200/technics/$i",
                        "url"
                ))
            }
            subscriber.onNext(news)
        }
    }
}