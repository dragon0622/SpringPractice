package com.estsoft.hispring.repository;

import com.estsoft.hispring.controller.BookDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookRepository {
    private final Map<String, BookDTO> bookDTOMap;

    public BookRepository() {
        bookDTOMap = new HashMap<>();
        BookDTO book1 = new BookDTO("123", "가나다", "김정용");
        bookDTOMap.put(book1.getId(), book1);
    }

    public List<BookDTO> getAllBooks() {
        List<BookDTO> bookDTOList = new ArrayList<>();
        for (Map.Entry<String, BookDTO> book : bookDTOMap.entrySet()) {
            bookDTOList.add(book.getValue());
        }
        return bookDTOList;
    }

    public void addBook(BookDTO book) {
        bookDTOMap.put(book.getId(),book);
    }
}
