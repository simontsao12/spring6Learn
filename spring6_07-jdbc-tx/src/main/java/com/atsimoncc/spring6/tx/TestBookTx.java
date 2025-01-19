package com.atsimoncc.spring6.tx;

import com.atsimoncc.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName: TestBookTx
 * Package: com.atsimoncc.spring6.tx
 * Description:
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class TestBookTx {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        // bookController.buyBook(1, 1);

        // 買多本書
        Integer[] bookIds = {1, 2};
        bookController.checkOut(bookIds, 1);
    }
}
