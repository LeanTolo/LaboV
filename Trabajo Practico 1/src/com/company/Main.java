package com.company;

import com.company.models.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.*;

public class Main {

    public static void main(String[] args) {

        List<Viking> vikings = uploadVikings();
        List<Spartan> spartans = uploadSpartans();

        List<Viking> vikingsSorted = vikings.stream().sorted(Comparator.comparing(Viking::getAge)).collect(Collectors.toList());
        List<Spartan> spartansSorted = spartans.stream().sorted(Comparator.comparing(Spartan::getAge)).collect(Collectors.toList());

        Viking vikingToFight = vikingsSorted.get((int)(Math. random()*vikingsSorted.size()));
        Spartan spartanToFight = spartansSorted.get((int)(Math. random()*spartansSorted.size()));

    }

    public static List<Viking> uploadVikings(){
        List<Viking> vikings = new ArrayList<Viking>();

        vikings.add(new Viking("Lean",23,100, new DrinkVikingImp(), new PeeVikingImp(),10));
        vikings.add(new Viking("Thor",24,99, new DrinkVikingImp(), new PeeVikingImp(),9));
        vikings.add(new Viking("Thanos",25,98, new DrinkVikingImp(), new PeeVikingImp(),9));
        vikings.add(new Viking("Hulk",26,97, new DrinkVikingImp(), new PeeVikingImp(),5));
        vikings.add(new Viking("Thrall",27,96, new DrinkVikingImp(), new PeeVikingImp(),3));

        return vikings;
    }

    public static List<Spartan> uploadSpartans(){
        List<Spartan> spartans = new ArrayList<Spartan>();

        spartans.add(new Spartan("Carlos",22,120, new DrinkSpartanImp(), new PeeSpartanImp(),8));
        spartans.add(new Spartan("Juan",21,110, new DrinkSpartanImp(), new PeeSpartanImp(),7));
        spartans.add(new Spartan("Leonidas",20,90, new DrinkSpartanImp(), new PeeSpartanImp(),7));
        spartans.add(new Spartan("Gonzalo",19,70, new DrinkSpartanImp(), new PeeSpartanImp(),4));
        spartans.add(new Spartan("German",18,80, new DrinkSpartanImp(), new PeeSpartanImp(),2));

        return spartans;
    }

}
