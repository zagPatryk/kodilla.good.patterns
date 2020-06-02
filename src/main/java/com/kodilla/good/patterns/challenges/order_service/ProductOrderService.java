package com.kodilla.good.patterns.challenges.order_service;

import com.kodilla.good.patterns.challenges.order_service.data.Customer;
import com.kodilla.good.patterns.challenges.order_service.data.Product;
import com.kodilla.good.patterns.challenges.order_service.services.InformationService;
import com.kodilla.good.patterns.challenges.order_service.services.ServiceRepository;

public class ProductOrderService {
    private InformationService informationService;
    private ServiceRepository serviceRepository;

    public ProductOrderService(InformationService informationService, ServiceRepository serviceRepository) {
        this.informationService = informationService;
        this.serviceRepository = serviceRepository;
    }

    public void prepareRepository() {
        Product product1 = new Product("S10");
        Product product2 = new Product("S20");

        serviceRepository.addProductsToRepository(product1,20);
        serviceRepository.addProductsToRepository(product1,10);
        serviceRepository.addProductsToRepository(product2,1);
    }

    public boolean orderProcess(Product product, Customer customer, int quantity) {
        if (serviceRepository.getAvailableProducts().containsKey(product)) {
            if (serviceRepository.getAvailableProducts().get(product) >= quantity) {
                informationService.inform(customer);
                //order coś tam
                return true;
            } else if (serviceRepository.getAvailableProducts().get(product) < quantity) {
                return false;
            }
        }
        return false;
    }
}
