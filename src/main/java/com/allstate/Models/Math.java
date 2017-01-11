package com.allstate.Models;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

public class Math {

    public static int computeSquare(int num){
        return num * num;
    }

    public static int computeFactorial(int num){
        IntStream arr = range(1, num+1);

        int result = arr.reduce(1, (ini,val) -> {
            return ini * val;
        });

        return result;
    }

    public static int computeFibonacci(int num) {
        int a = 1, b = 1, i = 2;
        if(num < 2) return num;
        while (i < num) {
            int sum = a + b;
            a = b;
            b = sum;
            num--;
        }
        return b;
    }


}
