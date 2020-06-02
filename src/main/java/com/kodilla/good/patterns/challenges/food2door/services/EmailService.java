package com.kodilla.good.patterns.challenges.food2door.services;

import com.kodilla.good.patterns.challenges.food2door.data.ManOrCompany;

public class EmailService implements InformationService {
    @Override
    public void inform(ManOrCompany person, boolean ordered) {
        System.out.println("Mail with order info sent to: " + person.getEmail());
        if (ordered) {
            System.out.println("The order will be processed");
        } else {
            System.out.println("The order will not be processed");
        }
    }
}
