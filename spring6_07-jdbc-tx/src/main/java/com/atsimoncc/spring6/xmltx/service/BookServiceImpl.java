package com.atsimoncc.spring6.xmltx.service;

import com.atsimoncc.spring6.xmltx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName: BookServiceImpl
 * Package: com.atsimoncc.spring6.tx.service
 * Description:
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    // 買書方法: 書 id 和用戶 id
    @Override
    public void buyBook(Integer bookId, Integer userId) {

        // 根據書 id 查詢價格
        Integer price = bookDao.getBookPriceByBookId(bookId);
        // 更新庫存 -1
        bookDao.updateStock(bookId);
        // 更新用戶餘額
        bookDao.updateUserBalance(userId, price);
    }
}
