package com.kodilla.good.patterns.challenges.food2door.services;

import com.kodilla.good.patterns.challenges.food2door.data.ManOrCompany;

public interface InformationService {
    default void inform(ManOrCompany person, boolean ordered) {
        System.out.println("Wysłano maila o zamówieniu do: " + person.getEmail());
    }
}
