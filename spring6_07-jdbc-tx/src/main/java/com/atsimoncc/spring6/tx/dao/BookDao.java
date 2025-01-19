package com.atsimoncc.spring6.tx.dao;

/**
 * ClassName: BookDao
 * Package: com.atsimoncc.spring6.tx.dao
 * Description:
 */
public interface BookDao {

    // 根據書 id 查詢價格
    Integer getBookPriceByBookId(Integer bookId);
    // 更新庫存 -1
    void updateStock(Integer bookId);
    // 更新用戶餘額
    void updateUserBalance(Integer userId, Integer price);
}
