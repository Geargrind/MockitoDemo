package com.example.mockitodemo.Service;

import com.example.mockitodemo.Repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    HelloWorldRepository helloWorldRepository;

    public String helloMessage(){
        return helloWorldRepository.getHelloWorld();
    }
}
