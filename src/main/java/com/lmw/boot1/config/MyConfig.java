package com.lmw.boot1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.crypto.Data;
import java.util.Date;

@Configuration
public class MyConfig {
    @Bean
    public Date getDate(){
        return new Date();
    }

}
