package com.miramontes.springdiexamples.Controller;

import com.miramontes.springdiexamples.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
