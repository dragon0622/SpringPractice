package com.estsoft.hispring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getbooks() {
        return "bookManager";
    }

}
