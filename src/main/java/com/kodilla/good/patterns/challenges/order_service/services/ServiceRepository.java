package com.kodilla.good.patterns.challenges.order_service.services;

import com.kodilla.good.patterns.challenges.order_service.data.Product;

import java.util.Map;

public interface ServiceRepository {
    void addProductsToRepository(Product product, Integer quantity);
    Map<Product, Integer> getAvailableProducts();
}
