package com.kodilla.good.patterns.challenges.allegro.services;

import com.kodilla.good.patterns.challenges.allegro.data.Product;

import java.util.Map;

public interface ServiceRepository {
    void addProductsToRepository(Product product, Integer quantity);
    Map<Product, Integer> getAvailableProducts();
}
