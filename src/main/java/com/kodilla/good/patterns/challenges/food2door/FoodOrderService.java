package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.data.Food;
import com.kodilla.good.patterns.challenges.food2door.data.FoodCustomer;
import com.kodilla.good.patterns.challenges.food2door.services.requirements.FoodSupplierRequirements;
import com.kodilla.good.patterns.challenges.food2door.services.requirements.InformationService;


public class FoodOrderService {
    private InformationService informationService;
    private FoodSupplierRequirements foodSupplier;

    public FoodOrderService(InformationService informationService, FoodSupplierRequirements foodSupplier) {
        this.informationService = informationService;
        this.foodSupplier = foodSupplier;
    }

    public void prepareMenu() {
        Food food1 = new Food("Sernik");
        Food food2 = new Food("Maslowiak");

        foodSupplier.addNewFood(food1);
        foodSupplier.addNewFood(food2);
        foodSupplier.addNewFood(food2);
    }

    public boolean orderProcess(Food product, FoodCustomer customer, int quantity) {
        if (foodSupplier.isPossibleToOrder(product, customer, quantity)) {
            informationService.inform(customer, true);
            informationService.inform(foodSupplier.getFoodSupplier(), true);
            return true;
        } else {
            informationService.inform(customer, false);
            return false;
        }
    }
}

