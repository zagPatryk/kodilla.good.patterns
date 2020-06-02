package com.kodilla.good.patterns.challenges.food2door.data;

public class Supplier implements ManOrCompany {
    private String name;
    private String address;
    private String email;

    public Supplier(String name, String address, String email) {
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
