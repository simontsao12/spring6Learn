package com.atsimoncc.spring6.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: CheckOutServiceImpl
 * Package: com.atsimoncc.spring6.tx.service
 * Description:
 */
@Service
public class CheckOutServiceImpl implements CheckOutService{
    // 注入 bookService
    @Autowired
    private BookService bookService;

    // 買多本書的方法
    @Transactional
    @Override
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            // 呼叫 bookService 方法
            bookService.buyBook(bookId, userId);
        }
    }
}
