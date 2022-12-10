package ru.madrabit.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class FinalValueOfVariableAfterPerformingOperations {

    public static double myPow(double x, int n) {
        if(n < 0) {
            x = 1 / x;
        }
        double result = 1;
        for (int i = 0; i < Math.abs(n); i++ ) {
            result *= x;
        }
        return result;
    }


    public static void main(String[] args) {

//        int [] arr1= new int[]{1,4,2,3};
        int[] arr2 = new int[]{0, 4, 3, 0, 4};
        System.out.println(myPow(2, -2));

    }


}


