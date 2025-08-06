package com.eazybytes.main;

import java.util.Arrays;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        int totalStudents = 3;
        int totalSubjects = 6;

        String [][] studentMarks = new String[3][7];
        studentMarks[0][0] = "Yash";
        studentMarks[0][1] = "76";
        studentMarks[0][2] = "72";
        studentMarks[0][3] = "100";
        studentMarks[0][4] = "89";
        studentMarks[0][5] = "77";
        studentMarks[0][6] = "99";

        studentMarks[1][0] = "John";
        studentMarks[1][1] = "78";
        studentMarks[1][2] = "73";
        studentMarks[1][3] = "100";
        studentMarks[1][4] = "89";
        studentMarks[1][5] = "77";
        studentMarks[1][6] = "99";

        studentMarks[2][0] = "Lucy";
        studentMarks[2][1] = "76";
        studentMarks[2][2] = "73";
        studentMarks[2][3] = "100";
        studentMarks[2][4] = "87";
        studentMarks[2][5] = "77";
        studentMarks[2][6] = "99";

//        System.out.println(Arrays.deepToString(studentMarks));

        for (int i = 0; i < studentMarks.length; i++) {
            for (int j = 0; j < studentMarks[i].length; j++) {
                System.out.print(studentMarks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
