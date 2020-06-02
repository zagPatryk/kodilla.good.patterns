package com.kodilla.good.patterns.challenges.order_service.services;

import com.kodilla.good.patterns.challenges.order_service.data.Product;

import java.util.HashMap;
import java.util.Map;

public class Repository implements ServiceRepository{
    private Map<Product, Integer> availableProducts = new HashMap<>();

    @Override
    public void addProductsToRepository(Product product, Integer quantity) {
        if (availableProducts.containsKey(product)) {
            availableProducts.replace(product,availableProducts.get(product) + quantity);
        } else {
            availableProducts.put(product, quantity);
        }
    }

    @Override
    public Map<Product, Integer> getAvailableProducts() {
        return availableProducts;
    }
}
