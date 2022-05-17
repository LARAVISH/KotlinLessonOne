package com.example.kotlinlesson

data class HomeWork(var title: String, var description: String) {
    var title2 = "title2"
        get() {
            return "$field 55 "
        }
}