package com.pluralsight;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        //create our garage
        Garage garage = new Garage();

        //create some things to go in the garage
        StandardKart kart1 = new StandardKart("Mushroom Kart", BigDecimal.valueOf(1000.72), 5);
        JetKart kart2 = new JetKart("Blue Falcon Jet Kart", BigDecimal.valueOf(1500.85), 2);
        CoinPile coins = new CoinPile(BigDecimal.valueOf(10));

        //add the items to the garage
        garage.addToGarage(kart1);
        garage.addToGarage(kart2);
        garage.addToGarage(coins);

        System.out.println("====== Garage Info =======");

        //display the total value of the garage
        System.out.println(garage.getTotalValue().setScale(2, BigDecimal.ROUND_HALF_UP));

    }

}
