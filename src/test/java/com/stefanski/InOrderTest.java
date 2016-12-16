package com.stefanski;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @author Dariusz Stefanski
 * @since 16 Dec 2016
 */
// fix method order
public class InOrderTest {

    @Test
    // a
    public void insertCustomer() {
        System.out.println("Insert customer");
//        throw new RuntimeException("Insert failed!");
    }

    @Test
    // b
    public void findCustomer() {
        System.out.println("Find customer");
    }
}
