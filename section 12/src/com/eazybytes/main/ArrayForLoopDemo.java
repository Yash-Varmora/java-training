package com.eazybytes.main;

public class ArrayForLoopDemo {
    public static void main(String[] args) {
        int[] mobileNumbers = new int[116];
        mobileNumbers[0] = 1234567890;
        mobileNumbers[1] = 1234567891;
        mobileNumbers[2] = 1234567892;
        mobileNumbers[3] = 1234567893;
        mobileNumbers[115] = 1234567894;
        for (int i = 0; i<mobileNumbers.length; i++){
            System.out.println("The element at index : " + i + " is " + mobileNumbers[i]);
        }

        String[] names = new String[3];
        for (int i = 0; i<names.length; i++){
            System.out.println("The element at index : " + i + " is " + names[i]);
        }

    }
}