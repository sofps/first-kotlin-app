package com.sofiaperez.kotlinapp

/**
 * Created by sofiaperez on 22/10/17.
 */
class Person(val name: String, val surname: String) {
    fun getFullName() = "$name $surname"
}