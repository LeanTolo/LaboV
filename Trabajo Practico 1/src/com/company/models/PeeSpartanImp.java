package com.company.models;

import com.company.interfaces.Pee;

public class PeeSpartanImp implements Pee {

    @Override
    public void pee() {
        System.out.println("Spartan is Peeing");
    }
}
