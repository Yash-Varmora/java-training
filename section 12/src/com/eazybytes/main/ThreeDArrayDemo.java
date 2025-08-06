package com.eazybytes.main;

import java.util.Arrays;

public class ThreeDArrayDemo {
    public static void main(String[] args) {
        int noOfStudents = 2;
        int subject = 4;
        int totalSemester = 5;

        int[][][] studentArray = new int[noOfStudents][subject][totalSemester];

        int[][] student1 = {
                {88,99,77,89,79},
                {89,99,77,89,79},
                {80,99,77,89,79},
                {98,99,77,89,79},
        };

        int[][] student2 = {
                {98,99,77,89,79},
                {88,99,77,89,79},
                {80,99,77,89,79},
                {89,99,77,89,79},
        };

        studentArray[0] = student1;
        studentArray[1] = student2;

        System.out.println(Arrays.deepToString(studentArray));
    }
}
