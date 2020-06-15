package com.kodilla.good.patterns.challenges.allegro.services;

import com.kodilla.good.patterns.challenges.allegro.data.HasEmailData;

public class MailService implements InformationService {
    @Override
    public void inform(HasEmailData hasEmailData) {
        System.out.println("Wysłano maila o zamówieniu do: " + hasEmailData.getEmail());
    }
}
