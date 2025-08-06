package com.eazybytes.marvel.app;

import com.eazybytes.marvel.base.Person;
import com.eazybytes.marvel.heros.IronMan;

public class DynamicPoly {
    public static void main(String[] args) {
        Person person= new IronMan();
        person.walk();
        person.eat("Ice-cream");
        IronMan ironMan = new IronMan();
        ironMan.callOverriddenEatMethod();
    }
}
