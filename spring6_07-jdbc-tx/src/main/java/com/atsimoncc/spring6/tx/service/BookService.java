package com.atsimoncc.spring6.tx.service;

/**
 * ClassName: BookService
 * Package: com.atsimoncc.spring6.tx.service
 * Description:
 */
public interface BookService {

    // 買書方法: 書 id 和用戶 id
    void buyBook(Integer bookId, Integer userId);
}
