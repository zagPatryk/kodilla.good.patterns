package com.kodilla.good.patterns.challenges.order_service.services;

import com.kodilla.good.patterns.challenges.order_service.data.Person;

public interface InformationService {
    default void inform(Person person) {
        System.out.println("Wysłano maila o zamówieniu do: " + person.getEmail());
    }
}
