//package org.example.test;
//
//import org.junit.*;
//import org.junit.jupiter.api.Test;
//
//import java.util.Date;
//
//
//// important Notations in Version 4 of JUnit
////  @Before, @BeforeClass,  @Test,  @AfterClass,  @After
//
//public class CalculatorTest {
//    static int i = 1;
//    @Test
//    public void addTest(){
//        int result = Calculator.add(10,20);
//        int expected = 30;
//        Assert.assertEquals(expected,result);
//    }
//
//    @Test(timeout = 5000)
//    public void division() throws InterruptedException {
//        int reult = Calculator.division(20,2);
//        int exp = 10;
//        Thread.sleep(4000);
//        Assert.assertEquals(exp,reult);
//    }
//    // @BeforeClass
//    @BeforeClass
//    public static void init(){
//        System.out.println("Testing is Start..."+ new Date());
//    }
//
//    @Before
//    public void countTest(){
//        System.out.println(i+" : Test Case..");
//        i++;
//    }
//
//    @AfterClass
//    public static void destroy(){
//        System.out.println("Testing is Over.."+ new Date());
//    }
//}
