package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.data.Food;
import com.kodilla.good.patterns.challenges.food2door.data.FoodCustomer;
import com.kodilla.good.patterns.challenges.food2door.services.EmailService;
import com.kodilla.good.patterns.challenges.food2door.supplaliers.ExtraFoodShop;

public class Food2DoorRunner {
    public static void main(String[] args) {
        FoodOrderService foodOrderService = new FoodOrderService(new EmailService(), new ExtraFoodShop());
        foodOrderService.prepareMenu();

        Food food = new Food("Sernik");
        FoodCustomer hungryCustomer = new FoodCustomer("Paweł Wierzgała","Słoneczna 3", "niedomyty16@buziaczek.pl");
        FoodCustomer moreHungryCustomer = new FoodCustomer("Piotr Wąsik","Rzeszow", "umyty2@ornitolog.pl");

        foodOrderService.orderProcess(food, hungryCustomer, 23);
        System.out.println("=====");
        foodOrderService.orderProcess(food, moreHungryCustomer, 213);
    }
}
