package com.company.models;

import com.company.interfaces.Drink;

public class DrinkSpartanImp implements Drink {

    @Override
    public void drink() {
        System.out.println("Spartan is Drinking");
    }
}
