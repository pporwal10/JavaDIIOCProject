package com.example.carmusicdiautowiring;

import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speaker {
    @Override
    public void makeSound() {
        System.out.println("Playing music using Sony Speakers");
    }
}