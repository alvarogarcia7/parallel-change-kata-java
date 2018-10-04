package com.pduda.field;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private int price;
    private boolean hasDiscount = false;

    private List<Integer> prices = new LinkedList<>();

    public void add(int price) {
        if (price >= 100) {
            hasDiscount = true;
        }
        this.price += price;
        this.prices.add(price);
    }

    public int calculateTotalPrice() {
        return price;
    }

    public boolean hasDiscount() {
        return hasDiscount;
    }

    public int numberOfProducts() {
        return prices.size();
    }
}
