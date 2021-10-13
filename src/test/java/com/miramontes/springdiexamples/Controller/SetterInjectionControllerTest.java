package com.miramontes.springdiexamples.Controller;

import com.miramontes.springdiexamples.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {

    SetterInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectionController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreetingService() {
        System.out.println("controller.getGreetingService() = " + controller.getGreeting());
    }
}