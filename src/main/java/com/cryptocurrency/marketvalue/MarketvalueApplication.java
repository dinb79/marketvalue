package com.cryptocurrency.marketvalue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class MarketvalueApplication {

	private static final Logger logger = LoggerFactory.getLogger(MarketvalueApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MarketvalueApplication.class, args);
	}
}
