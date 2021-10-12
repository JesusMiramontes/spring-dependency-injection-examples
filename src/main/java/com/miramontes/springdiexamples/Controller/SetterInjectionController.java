package com.miramontes.springdiexamples.Controller;

import com.miramontes.springdiexamples.services.GreetingService;

public class SetterInjectionController {

    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
