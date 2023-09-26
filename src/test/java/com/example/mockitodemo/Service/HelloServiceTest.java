package com.example.mockitodemo.Service;

import com.example.mockitodemo.Repository.HelloWorldRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloServiceTest {

    @Mock
    private HelloWorldRepository helloWorldRepository;



    //Arrange
    @InjectMocks
    HelloService helloService;

    @BeforeEach
    void init(){
        Mockito.when(helloWorldRepository.getHelloWorld()).thenReturn("Mocked Hello World!");
    }


    @Test
    void helloMessage() {
        //Act
        String result = helloService.helloMessage();

        //Assert
        assertEquals("Mocked Hello World!", result);
    }
}