package com.example.boottest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YangY
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping()
    public String getById(){
        System.out.println("getById is running....");
        return "springbootest";
    }
}
