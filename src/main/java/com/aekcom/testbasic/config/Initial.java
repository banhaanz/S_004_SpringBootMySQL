package com.aekcom.testbasic.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

@Component
@EnableCaching
public class Initial implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Initial.class);

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("----------------------------------------------------------------------");
        LOGGER.info("run ");
        LOGGER.info("----------------------------------------------------------------------");
    }
}