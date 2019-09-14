package com.example.test

import com.example.annotation.LogExecution
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(
    private val helloWorldService: HelloWorldService
) {

    @GetMapping("/hello")
    @LogExecution
    fun test(): String = helloWorldService.sayHello()
}
