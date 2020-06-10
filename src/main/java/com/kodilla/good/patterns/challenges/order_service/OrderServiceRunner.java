package com.kodilla.good.patterns.challenges.order_service;

import com.kodilla.good.patterns.challenges.order_service.data.Customer;
import com.kodilla.good.patterns.challenges.order_service.data.Product;
import com.kodilla.good.patterns.challenges.order_service.services.MailService;
import com.kodilla.good.patterns.challenges.order_service.services.Repository;

public class OrderServiceRunner {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new Repository());
        productOrderService.prepareRepository();

        Customer customer1 = new Customer("Paweł Wierzgała","Słoneczna 3", "niedomyty16@buziaczek.pl");
        Product product1 = new Product("S10");

        productOrderService.orderProcess(product1, customer1, 1);
    }
}
