package com.miramontes.springdiexamples.Controller;

import com.miramontes.springdiexamples.services.GreetingServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImplementation();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}