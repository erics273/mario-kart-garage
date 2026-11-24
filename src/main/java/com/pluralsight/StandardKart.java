package com.pluralsight;

import java.math.BigDecimal;

public class StandardKart extends Kart {

    private int reliability;

    public StandardKart(String name, BigDecimal basePrice, int reliability) {
        super(name, basePrice);
        this.reliability = reliability;
    }

    public int getReliability() {
        return reliability;
    }

    public void setReliability(int reliability) {
        this.reliability = reliability;
    }

    @Override
    public BigDecimal getValue() {
        return getBasePrice().multiply(BigDecimal.valueOf(reliability));
    }



}
