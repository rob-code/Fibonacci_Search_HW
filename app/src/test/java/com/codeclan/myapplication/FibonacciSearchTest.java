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

//    @Test
//    public void canGetAngle(){
//        assertEquals(45.0, fib.getAngle(), .1);
//    }

    @Test
    public void canGetSinOfAngle(){
        assertEquals(0.707, fib.getSin(45), .01);
    }

    @Test
    public void canGetMaximumSinOfAngle(){
        assertEquals(1, fib.getSin(90), .01);
    }

    @Test
    public void canPrintOutValuesOfSin(){
        fib.listValuesOfSin();
    }

    @Test
    public void canGetfibMinusOne(){
        assertEquals(8, fib.fibMinusOne(13));
    }








}
