package com.company;

import com.company.models.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        //get vikings
        List<Viking> vikings = uploadVikings();
        List<Spartan> spartans = uploadSpartans();

        //sort by age
        List<Viking> vikingsSortedByAge = vikings.stream().sorted(Comparator.comparing(Viking::getAge)).collect(Collectors.toList());
        List<Spartan> spartansSortedByAge = spartans.stream().sorted(Comparator.comparing(Spartan::getAge)).collect(Collectors.toList());
        //sort by weight
        List<Viking> vikingsSortedByWeight = vikings.stream().sorted(Comparator.comparing(Viking::getWeight)).collect(Collectors.toList());
        List<Spartan> spartansSortedByWeight = spartans.stream().sorted(Comparator.comparing(Spartan::getWeight)).collect(Collectors.toList());

        System.out.println("-------------------------------------------------------------\n");
        System.out.println("Show Vikings Sorted By Age: \n");
        showVikings(vikingsSortedByAge);
        System.out.println("Show Spartans Sorted By Age: \n");
        showSpartans(spartansSortedByAge);
        System.out.println("-------------------------------------------------------------\n");
        System.out.println("Show Vikings Sorted By Weight: \n");
        showVikings(vikingsSortedByWeight);
        System.out.println("Show Spartans Sorted By Weight: \n");
        showSpartans(spartansSortedByWeight);
        System.out.println("-------------------------------------------------------------\n");

        //get random
        Viking vikingToFightRand = vikingsSortedByAge.get((int)(Math. random()*vikingsSortedByAge.size()));
        Spartan spartanToFightRand = spartansSortedByAge.get((int)(Math. random()*spartansSortedByAge.size()));
        //get first
        Viking firstVikingToFight = vikingsSortedByWeight.get(0);
        Spartan firstSpartanToFight = spartansSortedByWeight.get(0);

        Human winner = new Human();
        winner = fightRand(vikingToFightRand,spartanToFightRand);
        System.out.println(winner.toString());

    }

    public static List<Viking> uploadVikings(){
        List<Viking> vikings = new ArrayList<Viking>();

        vikings.add(new Viking("Lean",23,100, new DrinkVikingImp(), new PeeVikingImp(),(int) Math.random()*10));
        vikings.add(new Viking("Thor",24,99, new DrinkVikingImp(), new PeeVikingImp(),(int) Math.random()*10));
        vikings.add(new Viking("Thanos",25,98, new DrinkVikingImp(), new PeeVikingImp(),(int) Math.random()*10));
        vikings.add(new Viking("Hulk",26,97, new DrinkVikingImp(), new PeeVikingImp(),(int) Math.random()*10));
        vikings.add(new Viking("Thrall",27,96, new DrinkVikingImp(), new PeeVikingImp(),(int) Math.random()*10));

        return vikings;
    }

    public static List<Spartan> uploadSpartans(){
        List<Spartan> spartans = new ArrayList<Spartan>();

        spartans.add(new Spartan("Carlos",22,120, new DrinkSpartanImp(), new PeeSpartanImp(),(int) Math.random()*10));
        spartans.add(new Spartan("Juan",21,110, new DrinkSpartanImp(), new PeeSpartanImp(),(int) Math.random()*10));
        spartans.add(new Spartan("Leonidas",20,90, new DrinkSpartanImp(), new PeeSpartanImp(),(int) Math.random()*10));
        spartans.add(new Spartan("Gonzalo",19,70, new DrinkSpartanImp(), new PeeSpartanImp(),(int) Math.random()*10));
        spartans.add(new Spartan("German",18,80, new DrinkSpartanImp(), new PeeSpartanImp(),(int) Math.random()*10));

        return spartans;
    }

    public static void showVikings(List<Viking> vikings){
        for (Viking viking:vikings) {
            System.out.println(viking.toString()+"\n");
        }
    }

    public static void showSpartans(List<Spartan> spartans){
        for (Spartan spartan:spartans) {
            System.out.println(spartan.toString()+"\n");
        }
    }

    public static Human fightRand(Viking viking, Spartan spartan){
        System.out.println("I'm Leandro Toloza, Here at The Dome, As The UFC, Presents the Fight Extravagance of Hole All Time" +
                "If You Want To Talk About people, Exitement and Attention It's all Here Tonight, Enjoy It Boys!" +
                "The Impact Meater Just Broke, This Are 2 Fighter People Consider, Among the Very Best, Pound For Pound in The World" +
                "Lets go to our Announcer \n\n");
        System.out.println("LAAAAADDDDIEEESSSSS, Gonzalo, German and GENTLEMENNNN, CAN YOU TRIGGER IT?, IT'S FIGHT NESSSS\n\n");

        System.out.println("Here Is The Challanger, He Is A Real Natural Talent, Fantastic Grow, If He Win Tonight, He Would Become The Youngest Champion In UFC History \n");
        System.out.println(viking.toString()+"\n");
        System.out.println("The Champion, He Is Truly A Hero In This Fight, Everything We Deserve, Everything He Offset, One Of The Finest Fighters Of The Planet" +
                "If Not The Best, People Said He Is Caft But He Is Confident, Totally An Animal.\n");
        System.out.println(spartan.toString()+"\n");

        Human winner = new Human();
        double limitVik = 0;
        limitVik = 10 + viking.Age*1.2 + viking.Weight*1.3 + viking.proDrinker*1.8;
        double limitSpart = 0;
        limitSpart = 10 + spartan.Age*1.2 + spartan.Weight*1.3;
        int ammoutDrinked = 0;

        while (limitSpart > 0 && limitVik > 0){
            viking.drink();
            limitVik--;
            spartan.drink();
            limitSpart--;
            ammoutDrinked++;

            if (Math. random()*limitVik <= (1+spartan.extraTolerance)){
                viking.pee();
                limitVik = 0;
                winner = spartan;
            }else if (Math. random()*limitSpart <= 1){
                spartan.pee();
                limitSpart = 0;
                winner = viking;
            }
        }
        winner.AlcoholInBlood = ammoutDrinked;
        return winner;
    }

}
