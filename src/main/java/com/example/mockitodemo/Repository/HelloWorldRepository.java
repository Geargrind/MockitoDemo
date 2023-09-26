package com.example.mockitodemo.Repository;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldRepository {
    public String getHelloWorld() {
        return "Hello World!";
    }
}
