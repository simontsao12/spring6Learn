package com.atsimoncc.spring6.tx;

import com.atsimoncc.spring6.tx.congif.SpringConfig;
import com.atsimoncc.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ClassName: TestAnno
 * Package: com.atsimoncc.spring6.tx
 * Description:
 */
public class TestAnno {
    @Test
    public void testTxAllAnnotation() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController bookController = context.getBean("bookController", BookController.class);
        Integer[] bookIds = {1, 2};
        bookController.checkOut(bookIds, 1);
    }
}
