package com.atsimoncc.spring6.tx.controller;

import com.atsimoncc.spring6.tx.service.BookService;
import com.atsimoncc.spring6.tx.service.CheckOutService;
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

    @Autowired
    private CheckOutService checkOutService;
    // 買多本書
    public void checkOut(Integer[] bookIds, Integer userId) {
        // 呼叫 checkOutService 方法買多本書
        checkOutService.checkout(bookIds, userId);
    }
}
