package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private double total;

    public Cart() {
        this.products = new ArrayList<>();
        this.total = 0.0;
    }

    public void addProduct(Product product) {
        double price = product.getPrice();
        if (price > 100) {
            price *= 0.9; // Aplicar un descuento del 10%
        }
        this.total += price;
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        double price = product.getPrice();
        if (price > 100) {
            price *= 0.9; // Aplicar un descuento del 10%
        }
        this.total -= price;
        this.products.remove(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public double getTotal() {
        return total;
    }

    public int getProductCount() {
        return products.size();
    }

    public void clear() {
        products.clear();
        total = 0.0;
    }
}
