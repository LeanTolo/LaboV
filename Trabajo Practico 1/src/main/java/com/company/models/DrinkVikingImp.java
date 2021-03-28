package com.company.models;

import com.company.interfaces.Drink;

public class DrinkVikingImp implements Drink {

    @Override
    public void drink() {
        System.out.println("Viking is Drinking");
    }
}
