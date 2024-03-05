package com.estsoft.hispring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
public class BookController {

    @GetMapping("/books")
    public String getbooks(Model model) {
        BookDTO bookDTO = new BookDTO("123","가나다","김정용");
        model.addAttribute("bookList", List.of(bookDTO));
        return "bookManager";
    }

}
