package com.estsoft.hispring.controller;

import com.estsoft.hispring.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("bookList", bookList);
        return "bookManager";
    }
    @PostMapping("/books")
    public String saveBook(@RequestParam("id")String id, //가져온 값을 id로 저장
                           @RequestParam("name")String name,
                           @RequestParam("author")String author){
        bookRepository.addBook(new BookDTO(id, name, author));
        //POST / books?id=xx&name=xx&author=xx
        return "redirect:/books";
    }
    @GetMapping("/books/{id}")
    public String detail(@PathVariable("id") String isbn, Model model) {
        System.out.println("isbn = " + isbn);

        //화면에 보여줄 book 객체를 모델에 넣는 코드 작성
        model.addAttribute("book",bookRepository.getBook(isbn));

        return "bookDetail";
    }

}
