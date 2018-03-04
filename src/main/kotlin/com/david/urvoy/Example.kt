package com.david.urvoy

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@EnableAutoConfiguration
@RestController
class Example {

    @RequestMapping("/")
    fun home() = "Hello, World!"
}

fun main(args: Array<String>) {
    SpringApplication.run(Example::class.java)
}