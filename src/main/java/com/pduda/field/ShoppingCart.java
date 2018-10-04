package com.pduda.field;

public class ShoppingCart {
    private int price;
    private int numberOfProducts = 0;

    public void add(int price) {
        this.numberOfProducts++;
        this.price = price;
    }

    public int calculateTotalPrice() {
        return price;
    }

    public boolean hasDiscount() {
        return price >= 100;
    }

    public int numberOfProducts() {
        return numberOfProducts;
    }
}
