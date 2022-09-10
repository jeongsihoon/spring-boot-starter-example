package com.example.springbootstarterexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootStarterExampleApplication

fun main(args: Array<String>) {
    runApplication<SpringBootStarterExampleApplication>(*args)
}
