package com.kodilla.good.patterns.challenges.flight.services;

import com.kodilla.good.patterns.challenges.flight.data.AirportRequirements;
import com.kodilla.good.patterns.challenges.flight.data.FlightWithTransfer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FlightSearcherService {
    Map<AirportRequirements,List<AirportRequirements>> flightsMap = new HashMap<>();
    List<AirportRequirements> getAllFlightsFromAirport(AirportRequirements airport);
    List<AirportRequirements> getAllFlightsToAirport(AirportRequirements airport);
    List<FlightWithTransfer> flightSearcher(AirportRequirements departureAirport, AirportRequirements destinationAirport);
    boolean prepareFlightList();
}
