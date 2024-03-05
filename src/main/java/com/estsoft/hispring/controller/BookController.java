package com.estsoft.hispring.controller;

import com.estsoft.hispring.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

@Controller
public class BookController {
    private final BookRepository bookRepository;
    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    public String getbooks(Model model) {
        List<BookDTO> bookList = bookRepository.getAllBooks();
//        BookDTO bookDTO = new BookDTO("123","가나다","김정용");
        model.addAttribute("bookList", List.of(bookList));
        return "bookManager";
    }

}
