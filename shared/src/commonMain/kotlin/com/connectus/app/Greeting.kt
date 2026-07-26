package com.connectus.app

expect class Platform() {
    val name: String
}

class Greeting {
    private val platform = Platform()

    fun greet(): String = "Hello, ${platform.name}!"
}
