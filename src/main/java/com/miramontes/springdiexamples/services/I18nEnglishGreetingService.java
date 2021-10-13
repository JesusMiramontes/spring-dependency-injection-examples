package com.miramontes.springdiexamples.services;

import org.springframework.stereotype.Service;

@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world. -EN";
    }
}
