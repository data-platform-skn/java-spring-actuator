package com.example.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

@PropertySource("classpath:application.properties")
public class PropertiesWithJavaConfig {

    @Value("${a}")
    private String sampleKey;

    public String getSampleKey(){
        return sampleKey;
    }
}