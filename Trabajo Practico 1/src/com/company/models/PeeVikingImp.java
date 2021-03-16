package com.company.models;

import com.company.interfaces.Pee;

public class PeeVikingImp implements Pee {

    @Override
    public void pee() { System.out.println("Viking is Peeing"); }
}
