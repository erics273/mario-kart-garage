package com.pluralsight;

import java.math.BigDecimal;

public class CoinPile implements Valuable {
    private BigDecimal coins;

    public CoinPile(BigDecimal coins) {
        this.coins = coins;
    }

    public BigDecimal getCoins() {
        return coins;
    }

    public void setCoins(BigDecimal coins) {
        this.coins = coins;
    }

    public BigDecimal getValue(){
            return this.getCoins();
    }

    @Override
    public String toString() {
        return "CoinPile - Value: " + this.getValue();
    }
}
