package com.miramontes.springdiexamples.services;

public class GreetingServiceImplementation implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world.";
    }
}
