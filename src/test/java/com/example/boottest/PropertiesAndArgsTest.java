package com.example.boottest;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest(properties = {"test.prop=testValue1"})
@SpringBootTest(args = {"--test.prop=testValue2"})
public class PropertiesAndArgsTest {
    @Value("${test.prop}")
    private String message;
    @Test
    void testProperties(){
        System.out.println(message);
    }
}
