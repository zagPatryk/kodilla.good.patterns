package com.kodilla.good.patterns.challenges.order_service.services;

import com.kodilla.good.patterns.challenges.order_service.data.HasEmailData;

public class MailService implements InformationService {
    @Override
    public void inform(HasEmailData hasEmailData) {
        System.out.println("Wysłano maila o zamówieniu do: " + hasEmailData.getEmail());
    }
}
