package com.eazybytes.main;

import java.util.Arrays;

public class SearchDemo {
    public static void main(String[] args) {
        int[] num = {34,53,5,3,5,13,1,3,1,3};
        Arrays.sort(num);
        int index =Arrays.binarySearch(num, 3);
        System.out.println(index);
    }
}
