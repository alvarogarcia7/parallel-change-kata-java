package com.pduda.field;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private int price;

    private List<Integer> prices = new LinkedList<>();

    public void add(int price) {
        this.price += price;
        this.prices.add(price);
    }

    public int calculateTotalPrice() {
        return price;
    }

    public boolean hasDiscount() {
        return prices.stream().anyMatch(it -> it >= 100);
    }

    public int numberOfProducts() {
        return prices.size();
    }
}
