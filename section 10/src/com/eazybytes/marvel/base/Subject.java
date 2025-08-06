package com.eazybytes.marvel.base;

public abstract class Subject {

    public  int marks;
    public static final int MIN_MARKS = 0;

    public int totalMArks(){
        return 100;
    }

    public abstract void teach();
}
