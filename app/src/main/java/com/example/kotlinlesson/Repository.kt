package com.example.kotlinlesson

object Repository {
    private val list: MutableList<HomeWork> = ArrayList()

    fun getAll(): List<HomeWork> {
        list.add(HomeWork("title1", "description1"))
        list.add(HomeWork("title2", "description2"))
        list.add(HomeWork("title3", "description3"))
        return list
    }
}