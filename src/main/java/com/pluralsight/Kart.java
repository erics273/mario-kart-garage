package com.pluralsight;

import java.math.BigDecimal;

public abstract class Kart implements Valuable, Comparable<Kart> {

    private String name;
    private BigDecimal basePrice;

    public Kart(String name, BigDecimal basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public int compareTo(Kart kart) {

        //sort by name
        return this.getName().compareTo(kart.getName());

        //sort by price
//        return this.getValue().compareTo(kart.getValue());

    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + " ( " + this.getName() + " ) + - value: " + this.getValue() + " }";
    }
}
