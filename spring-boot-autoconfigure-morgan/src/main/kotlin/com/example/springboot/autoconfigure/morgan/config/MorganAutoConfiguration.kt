package com.example.springboot.autoconfigure.morgan.config

import com.example.springmorgan.Morgan
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class MorganAutoConfiguration {
    private val log = LoggerFactory.getLogger(javaClass.name)

    @Bean
    @ConditionalOnMissingBean
    fun morgan(): Morgan {
        log.info("creating Morgan Bean")
        return Morgan("default_key1", "default_key2")
    }
}
