package com.arnassmicius.websocketsintellij.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @RequestMapping("/hello")
    fun hello(): HelloWorld {
        return HelloWorld("Hello!!!")
    }
}

data  class HelloWorld(val text: String)