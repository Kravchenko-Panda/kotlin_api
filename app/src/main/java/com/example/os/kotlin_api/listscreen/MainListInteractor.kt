package com.example.os.kotlin_api.listscreen

import com.example.os.kotlin_api.date.remote.http.json.Post
import io.reactivex.Observable


interface MainListInteractor {

    fun execute(): Observable<List<Post>>
}