package com.example.carmusicdiautowiring;

import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speaker {
    @Override
    public void makeSound() {
        System.out.println("Playing music using Bose Speakers");
    }
}