package com.example.carmusicdiautowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServices {
    private final Speaker speaker;
    private final Tyre tyre;

    @Autowired
    public VehicleServices(Speaker sonySpeakers, Tyre bridgeStoneTyres) {
        this.speaker = sonySpeakers;
        this.tyre = bridgeStoneTyres;
    }

    public void performAction() {
        speaker.makeSound();
        tyre.rotate();
    }
}
