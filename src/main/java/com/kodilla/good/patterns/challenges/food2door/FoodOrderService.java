package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.data.Food;
import com.kodilla.good.patterns.challenges.food2door.data.Man;
import com.kodilla.good.patterns.challenges.food2door.services.FoodSupplier;
import com.kodilla.good.patterns.challenges.food2door.services.InformationService;


public class FoodOrderService {
    private InformationService informationService;
    private FoodSupplier foodSupplier;

    public FoodOrderService(InformationService informationService, FoodSupplier foodSupplier) {
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

    public boolean orderProcess(Food product, Man customer, int quantity) {
        if (foodSupplier.process(product, customer, quantity)) {
            informationService.inform(customer, true);
            informationService.inform(foodSupplier.getSupplier(), true);
            return true;
        } else {
            informationService.inform(customer, false);
            return false;
        }
    }
}

