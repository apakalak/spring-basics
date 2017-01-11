package com.allstate.Models;

import org.junit.Test;

import static org.junit.Assert.*;


public class MathTest {

    @Test
    public void computeSquare() throws Exception {
        int result = Math.computeSquare(4);
        assertEquals(16, result);
    }

    @Test
    public void computeFactorial() throws Exception {
        int result = Math.computeFactorial(5);
        assertEquals(120, result);
    }

    @Test
    public void computeFibonacci() throws Exception {
        int result = Math.computeFibonacci(15);
        assertEquals(610, result);
    }

}