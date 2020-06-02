package com.kodilla.good.patterns.challenges.food2door.supplaliers;

import com.kodilla.good.patterns.challenges.food2door.data.Food;
import com.kodilla.good.patterns.challenges.food2door.data.Man;
import com.kodilla.good.patterns.challenges.food2door.data.Supplier;
import com.kodilla.good.patterns.challenges.food2door.services.FoodSupplier;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements FoodSupplier {
    private Supplier supplier = new Supplier("ExtraFoodShop","Wawa","inform@ExtraFoodShop.com");
    private List<Food> foodsList = new ArrayList<>();

    @Override
    public Supplier getSupplier() {
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
    public boolean process(Food food, Man customer, int quantity) {
        if (foodsList.contains(food)) {
            if (customer.getAddress().equals("Rzeszow")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
