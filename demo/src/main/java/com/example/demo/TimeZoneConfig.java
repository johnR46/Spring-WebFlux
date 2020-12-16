package com.example.demo;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class TimeZoneConfig {
    @PostConstruct
    public void setDefaultTimeZone() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Bangkok"));
         log.info("set Default Time Zone => {}", TimeZone.getDefault().getID());
    }
}

