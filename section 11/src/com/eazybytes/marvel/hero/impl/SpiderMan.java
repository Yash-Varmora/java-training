package com.eazybytes.marvel.hero.impl;

import com.eazybytes.marvel.hero.SuperHero;

public class SpiderMan implements SuperHero {
    @Override
    public String usePower() {
        return "SpiderMan using his power";
    }

    /**
     * If Y received kill the villain
     * If N received stop the villain
     *
     * @param c indicates Y or N
     * @return - Returns status
     */
    @Override
    public String stopVillain(char c) {
        if (c == 'Y'){
            return "SpiderMan killed the villain";
        } else {
            return "SpiderMan stop the villain";
        }
    }

    @Override
    public String trackLiveLocation(){
        String liveLocation = "London";
        System.out.println("I am in " + liveLocation);
        return liveLocation;
    }

    static String commonCharacteristics(){
        return "Superhuman abilities, Willingness to sacrifice";
    }
}
