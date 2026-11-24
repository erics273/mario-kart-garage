package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //create our garage
        Garage garage = new Garage();

        //create some things to go in the garage
        StandardKart kart1 = new StandardKart("Mushroom Kart", BigDecimal.valueOf(2000.72), 5);
        JetKart kart2 = new JetKart("Blue Falcon Jet Kart", BigDecimal.valueOf(1500.85), 2);
        CoinPile coins = new CoinPile(BigDecimal.valueOf(10));

        //add the items to the garage
        garage.addToGarage(kart1);
        garage.addToGarage(kart2);
        garage.addToGarage(coins);


        System.out.println("====== Garage Info =======");

        //display the total value of the garage
        System.out.println(garage.getTotalValue().setScale(2, BigDecimal.ROUND_HALF_UP));

        List<Kart> karts = new ArrayList<>();
        karts.add(kart1);
        karts.add(kart2);

        System.out.println("====== Karts Before Sort =======");

        for (Kart kart : karts) {
            System.out.println(kart.toString());
        }

        //sort my garage items
        Collections.sort(karts);

        System.out.println("====== Karts After Sort =======");

        //loop over the karts and display them
//        for (Kart kart : karts) {
//            System.out.println(kart.toString());
//        }

        BigDecimal maxValueKart = karts.stream()
                .map(Kart::getValue)
                .max(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);

        System.out.println("most exepensive kart: " + maxValueKart);

        karts.stream()
                .filter(kart -> kart.getName().equals("Mushroom Kart"))
                .forEach(System.out::println);



    }

}
