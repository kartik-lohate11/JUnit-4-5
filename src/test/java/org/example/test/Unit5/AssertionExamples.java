package org.example.test.Unit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AssertionExamples extends Assertions{

    @BeforeAll
    public void init() {
        System.out.println("Testing start..");
    }

    @Test
    public void testAssertions(){
        // Example 1
//        int[] arr = {1,2,3,4,5,5,6},arr1= {1,2,3,4,5,6,9};
//        Assertions.assertArrayEquals(arr,arr1);  // false

//        float i = 10;
//        Float j = 10.0f;
//        Assertions.assertEquals(i,j);

        String i = "kartik";
        String j = "kartik";
        Assertions.assertEquals(i,j);
        Assertions.assertSame(i,j);

//        String i1 = new String("hello");
//        String i2 = new String("hello");
//        assertSame(i1,i2);  // false;

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        assertEquals(list1,list);

        assertThrows(RuntimeException.class,()->{
          throw new RuntimeException();
        });

        boolean a1 = true;
        assertTrue(a1);

    }
}
