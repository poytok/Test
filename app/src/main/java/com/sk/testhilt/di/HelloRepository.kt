package com.sk.testhilt.di

import com.sk.testhilt.SampleData

/**
 * Created by jeongjaehwan on 2020/09/25
 **/
interface HelloRepository {
    fun giveHello(): SampleData
}

class HelloRepositoryImpl() : HelloRepository {
    override fun giveHello() = SampleData("", 1, 2f)
}