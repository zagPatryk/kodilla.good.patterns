package com.kodilla.good.patterns.challenges.order_service.data;

public class Customer implements HasEmailData {
    private String name;
    private String address;
    private String email;

    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
