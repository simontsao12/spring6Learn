package com.atsimoncc.spring6.xmltx.controller;

import com.atsimoncc.spring6.xmltx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * ClassName: BookController
 * Package: com.atsimoncc.spring6.tx.controller
 * Description:
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    // 買書方法: 書 id 和用戶 id
    public void buyBook(Integer bookId, Integer userId) {
        // 呼叫 service 方法
        bookService.buyBook(bookId, userId);
    }
}
