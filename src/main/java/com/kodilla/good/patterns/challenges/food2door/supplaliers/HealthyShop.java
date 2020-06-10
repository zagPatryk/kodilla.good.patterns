package com.kodilla.good.patterns.challenges.food2door.supplaliers;

import com.kodilla.good.patterns.challenges.food2door.data.Food;
import com.kodilla.good.patterns.challenges.food2door.data.FoodCustomer;
import com.kodilla.good.patterns.challenges.food2door.data.FoodSupplier;
import com.kodilla.good.patterns.challenges.food2door.services.requirements.FoodSupplierRequirements;


import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements FoodSupplierRequirements {
    private FoodSupplier supplier = new FoodSupplier("HealthyShop","Rz","inf@HealthyShop.com");
    private List<Food> foodsList = new ArrayList<>();

    @Override
    public FoodSupplier getFoodSupplier() {
        return supplier;
    }

    @Override
    public boolean addNewFood(Food food) {
        if (foodsList.contains(food)) {
            System.out.println("This provider has a food with this name");
            return false;
        } else {
            System.out.println("Food added to the supplier list");
            foodsList.add(food);
            return true;
        }
    }

    @Override
    public List<Food> getAvailableFoods() {
        return foodsList;
    }

    @Override
    public boolean isPossibleToOrder(Food food, FoodCustomer customer, int quantity) {
        if (foodsList.contains(food)) {
            if (quantity<20) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

