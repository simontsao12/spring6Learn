package com.atsimoncc.spring6.tx.service;

/**
 * ClassName: CheckOutService
 * Package: com.atsimoncc.spring6.tx.service
 * Description:
 */
public interface CheckOutService {

    // 買多本書的方法
    void checkout(Integer[] bookIds, Integer userId);
}
