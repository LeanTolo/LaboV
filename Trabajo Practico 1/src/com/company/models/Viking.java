package com.company.models;

import com.company.interfaces.Drink;
import com.company.interfaces.Pee;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Viking extends Human{

    public Integer proDrinker;
    public Pee pee;
    public Drink drink;

    public Viking(String Name, Integer Age, Integer Weight, Drink drink, Pee pee, Integer proDrinker){
        super(Name,Age,Weight);
        this.drink = drink;
        this.pee = pee;
        this.proDrinker = proDrinker;
    }

    public void pee() {pee.pee();}
    public void drink() {drink.drink();}

}
