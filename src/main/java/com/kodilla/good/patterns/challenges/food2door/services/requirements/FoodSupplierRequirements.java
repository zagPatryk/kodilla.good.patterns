package com.kodilla.good.patterns.challenges.food2door.services.requirements;

import com.kodilla.good.patterns.challenges.food2door.data.Food;
import com.kodilla.good.patterns.challenges.food2door.data.FoodCustomer;
import com.kodilla.good.patterns.challenges.food2door.data.FoodSupplier;

import java.util.List;

public interface FoodSupplierRequirements {
    List<Food> getAvailableFoods();
    boolean addNewFood(Food food);
    boolean isPossibleToOrder(Food food, FoodCustomer customer, int quantity);
    FoodSupplier getFoodSupplier();
}
