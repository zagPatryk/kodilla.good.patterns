package com.kodilla.good.patterns.challenges.food2door.services.requirements;

import com.kodilla.good.patterns.challenges.food2door.data.requirements.MailRequirement;

public interface InformationService {
    void inform(MailRequirement person, boolean ordered);
}
