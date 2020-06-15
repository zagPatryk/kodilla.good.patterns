package com.kodilla.good.patterns.challenges.allegro;

import com.kodilla.good.patterns.challenges.allegro.data.Customer;
import com.kodilla.good.patterns.challenges.allegro.data.Product;
import com.kodilla.good.patterns.challenges.allegro.services.MailService;
import com.kodilla.good.patterns.challenges.allegro.services.Repository;

public class OrderServiceRunner {
    public static void main(String[] args) {
        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new Repository());
        productOrderService.prepareRepository();

        Customer customer1 = new Customer("Paweł Wierzgała","Słoneczna 3", "niedomyty16@buziaczek.pl");
        Product product1 = new Product("S10");

        productOrderService.orderProcess(product1, customer1, 1);
    }
}
