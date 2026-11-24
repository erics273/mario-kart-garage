package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Valuable> items = new ArrayList<>();

    public Garage() {
    }

    //put things in our garage
    public void addToGarage(Valuable valuable) {
        items.add(valuable);
    }

    public BigDecimal getTotalValue() {

        BigDecimal totalValue = new BigDecimal(0);
        for (Valuable valuable : items) {
            totalValue = totalValue.add(valuable.getValue());
        }
        return totalValue;
    }

    public List<Valuable> getItems() {
        return items;
    }

}
