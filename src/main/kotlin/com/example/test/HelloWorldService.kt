package com.example.test

import com.example.annotation.LogExecution
import org.springframework.stereotype.Service

@Service
class HelloWorldService {

    @LogExecution
    fun sayHello() = "Hello World!"
}
