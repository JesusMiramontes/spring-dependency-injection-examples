package com.miramontes.springdiexamples.Controller;

import com.miramontes.springdiexamples.services.GreetingServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {

    SetterInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectionController();
        controller.setGreetingService(new GreetingServiceImplementation());
    }

    @Test
    void getGreetingService() {
        System.out.println("controller.getGreetingService() = " + controller.getGreeting());
    }
}