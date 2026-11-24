package com.pluralsight;

import java.math.BigDecimal;

public class JetKart extends Kart {

    private int turboLevel;

    public JetKart(String name, BigDecimal basePrice, int turboLevel) {
        super(name, basePrice);
        this.turboLevel = turboLevel;
    }

    public int getTurboLevel() {
        return turboLevel;
    }

    public void setTurboLevel(int turboLevel) {
        this.turboLevel = turboLevel;
    }

    @Override
    public BigDecimal getValue() {
        return getBasePrice().multiply(BigDecimal.valueOf(turboLevel + 10));
    }

}
