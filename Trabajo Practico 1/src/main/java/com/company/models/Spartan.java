package com.company.models;

import com.company.interfaces.Drink;
import com.company.interfaces.Pee;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Spartan extends Human{

    //extra tolerance == more resistance to go to the bathroom
    public Integer extraTolerance;
    public Pee pee;
    public Drink drink;

    public Spartan(String Name, Integer Age, Integer Weight, Drink drink, Pee pee, Integer extraTolerance){
        super(Name,Age,Weight,0);
        this.drink = drink;
        this.pee = pee;
        this.extraTolerance = extraTolerance;
    }

    public void pee() {pee.pee();}
    public void drink() {drink.drink();}

}
