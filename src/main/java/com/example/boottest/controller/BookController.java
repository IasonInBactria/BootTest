package com.example.boottest.controller;


import com.example.boottest.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YangY
 */
@RestController
@RequestMapping("/books")
public class BookController {
//    @GetMapping()
//    public String getById(){
//        System.out.println("getById is running....");
//        return "springboottest";
//    }

    /**
     *
     * @return
     */
    @GetMapping()
    public Book getById(){
        System.out.println("getById is running....");
        Book book = new Book();
        book.setName("springboottest");
        book.setType("programming");
        book.setId(1);
        book.setDescription("233tew");

        return book;
    }
}
