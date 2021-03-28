package com.company.models;

import com.company.interfaces.Drink;
import com.company.interfaces.Pee;
import lombok.*;

@Getter
@Setter
public class Viking extends Human{

    //proDrinker == he can drink beers faster
    public Integer proDrinker;
    public Pee pee;
    public Drink drink;

    public Viking(String Name, Integer Age, Integer Weight, Drink drink, Pee pee, Integer proDrinker){
        super(Name,Age,Weight,0);
        this.drink = drink;
        this.pee = pee;
        this.proDrinker = proDrinker;
    }

    public void pee() {pee.pee();}
    public void drink() {drink.drink();}

}
