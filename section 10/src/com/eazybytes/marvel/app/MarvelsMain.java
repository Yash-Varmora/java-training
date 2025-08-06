package com.eazybytes.marvel.app;

import com.eazybytes.marvel.base.Person;
import com.eazybytes.marvel.heros.IronMan;

public class MarvelsMain {
    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        ironMan.walk();
        ironMan.sleep();
        ironMan.eat("Pasta");
        ironMan.usePower();

        Person person = new Person();
        int hc = person.hashCode();
        String str = person.toString();


    }
}
