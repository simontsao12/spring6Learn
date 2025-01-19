package com.atsimoncc.spring6.tx.service;

import com.atsimoncc.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * ClassName: BookServiceImpl
 * Package: com.atsimoncc.spring6.tx.service
 * Description:
 */
//@Transactional(readOnly = true)
//@Transactional(timeout = -1) // 永不超時
//@Transactional(timeout = 3) // 超時 3 秒回滾
//@Transactional(noRollbackFor = ArithmeticException.class) // 出現相關異常不進行回滾
//@Transactional(isolation = Isolation.DEFAULT) // 隔離級別
@Transactional(propagation = Propagation.REQUIRED) // 傳播行為 預設為 REQUIRED 而 REQUIRED 和REQUIRES_NEW 最常用到
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    // 買書方法: 書 id 和用戶 id
    @Override
    public void buyBook(Integer bookId, Integer userId) {
        // 模擬超時效果
        // try {
        //     TimeUnit.SECONDS.sleep(5);
        // } catch (InterruptedException e) {
        //     throw new RuntimeException(e);
        // }

        // 根據書 id 查詢價格
        Integer price = bookDao.getBookPriceByBookId(bookId);
        // 更新庫存 -1
        bookDao.updateStock(bookId);
        // 更新用戶餘額
        bookDao.updateUserBalance(userId, price);

        // 模擬異常
        // System.out.println(1/0);
    }
}
