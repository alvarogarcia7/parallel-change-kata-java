package com.pduda.field;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private List<Integer> prices = new LinkedList<>();

    public void add(int price) {
        this.prices.add(price);
    }

    public int calculateTotalPrice() {
        final int price2 = this.prices.stream().mapToInt(Integer::new).sum();
        return price2;
    }

    public boolean hasDiscount() {
        return prices.stream().anyMatch(it -> it >= 100);
    }

    public int numberOfProducts() {
        return prices.size();
    }
}
