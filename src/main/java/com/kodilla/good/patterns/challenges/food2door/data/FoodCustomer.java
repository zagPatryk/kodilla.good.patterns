package com.kodilla.good.patterns.challenges.food2door.data;

import com.kodilla.good.patterns.challenges.food2door.data.requirements.AddressRequirement;
import com.kodilla.good.patterns.challenges.food2door.data.requirements.MailRequirement;

public class FoodCustomer implements MailRequirement, AddressRequirement {
    private String name;
    private String address;
    private String email;

    public FoodCustomer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
