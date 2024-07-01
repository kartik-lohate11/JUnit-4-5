package org.example.test.Unit5;

import org.example.test.Calculator;
import org.junit.jupiter.api.*;

import java.util.Date;

public class Service {
    static int i = 1;

    @BeforeAll
    public static void in(){
        System.out.println("i am init..."+ new Date());
    }

    @Test
    public void addTest(){
        int result = Calculator.add(12,12);
        int exp = 24;
        Assertions.assertEquals(exp,result);
    }

    @Test
    public void divisionTest(){
        int result = Calculator.division(12,12);
        int exp = 1;
        Assertions.assertEquals(exp,result);
    }

    @BeforeAll
    public static void init(){
        System.out.println("Testing start..."+ new Date());
    }
    @BeforeAll
    public static void init3(){
        System.out.println("init Third..."+ new Date());
    }

    @BeforeEach
    public void countTest(){
        System.out.println(i+++"Test Case....");
    }

    @AfterAll
    public static void destroy(){
        System.out.println("Testing end..."+ new Date());
    }

    @BeforeAll
    public static void init2(){
        System.out.println("init second..."+ new Date());
    }

}
