package com.eazybytes.main;

import java.util.Arrays;

public class JaggedArrayDemo {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[4][];

        int[] array1 = {5,7,9,6,3,5};
        int[] array2 = {};
        int[] array3 = {57,9,65};
        int[] array4 = {57,9,6,35};

        jaggedArray[0] = array1;
        jaggedArray[1] = array2;
        jaggedArray[2] = array3;
        jaggedArray[3] = array4;

        System.out.println(Arrays.deepToString(jaggedArray));
    }
}
