package com.example.carmusicdiautowiring;

import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyre {

    @Override
    public void rotate() {
        System.out.println("BridgeStone Tyre rotating");
    }
}
