package com.example.carmusicdiautowiring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarMusicDiAutowiringApplication {

    public static void main(String[] args) {

        SpringApplication.run(CarMusicDiAutowiringApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(Person person) {
        return args -> {
            // The following line will invoke the travel method of the Person bean
            person.travel();
        };
    }

}
