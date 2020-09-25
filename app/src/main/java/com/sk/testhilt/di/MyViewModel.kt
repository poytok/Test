package com.sk.testhilt.di

import androidx.lifecycle.ViewModel

/**
 * Created by jeongjaehwan on 2020/09/25
 **/
class MyViewModel(private val repo: HelloRepository) : ViewModel() {
    fun sayHello() = "${repo.giveHello()} from $this"
}