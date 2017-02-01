package com.gsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan

@SuppressWarnings("squid:S2095")
/**
   Spring boot Application Class
 * @param <T> ...
 */
public class SampleApplication {
	/**
	   Spring boot Runner method
	 * @param <T> ...
	 */
    public static void main(String[] args) {
    	
        SpringApplication.run(SampleApplication.class, args);
    }
 
}