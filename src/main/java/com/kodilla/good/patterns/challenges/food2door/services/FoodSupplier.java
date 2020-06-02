package com.kodilla.good.patterns.challenges.food2door.services;

import com.kodilla.good.patterns.challenges.food2door.data.Food;
import com.kodilla.good.patterns.challenges.food2door.data.Man;
import com.kodilla.good.patterns.challenges.food2door.data.Supplier;

import java.util.List;

public interface FoodSupplier {
    List<Food> getAvailableFoods();
    boolean addNewFood(Food food);
    boolean process(Food food, Man customer, int quantity);
    Supplier getSupplier();
}
