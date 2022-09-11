package com.example.springmorgan

import org.springframework.beans.factory.annotation.Value

class Morgan(
    @Value("morgan.key1") private val key1: String,
    @Value("morgan.key2") private val key2: String,
)
