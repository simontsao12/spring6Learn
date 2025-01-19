package com.atsimoncc.spring6.xmltx;

import com.atsimoncc.spring6.xmltx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * ClassName: TestBookTx
 * Package: com.atsimoncc.spring6.tx
 * Description:
 */
@SpringJUnitConfig(locations = "classpath:beans-xml.xml")
public class TestBookTx {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        bookController.buyBook(1, 1);
    }
}
