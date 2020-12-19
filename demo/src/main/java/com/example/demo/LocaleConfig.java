package com.example.demo;

import java.util.Locale;
import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class LocaleConfig {

    @PostConstruct
    public void setDefaultLocale() {

        Locale.setDefault(Locale.forLanguageTag("th-TH"));

        log.info("set Default Locale => {}", Locale.getDefault());

    }

}