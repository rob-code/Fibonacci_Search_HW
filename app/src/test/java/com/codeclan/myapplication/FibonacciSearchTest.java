package com.codeclan.myapplication;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciSearchTest {

    FibonacciSearch fib;

    @Before
    public void before(){
        fib = new FibonacciSearch();
    }

    @Test
    public void canGetSinOfAngle(){
        assertEquals(0.707, fib.getSin(45), .01);
    }

//    @Test
//    public void canGetMaximumSinOfAngle(){
//        assertEquals(1, fib.getSin(90), .01);
//    }

//    @Test
//    public void canPrintOutValuesOfSin(){
//        fib.listValuesOfSin();
//    }

    @Test
    public void canGetFibMinusOne(){
        assertEquals(13, fib.fibMinusOne(8));
    }


    @Test
    public void canFindMaximumByFibonacciSearch(){
        fib.findMaximumByFibonacciSearch2(21);
    }





}
