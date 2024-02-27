package com.example.carmusicdiautowiring;

import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyre {

    @Override
    public void rotate() {
        System.out.println("Michelin Tyre rotating");
    }
}
