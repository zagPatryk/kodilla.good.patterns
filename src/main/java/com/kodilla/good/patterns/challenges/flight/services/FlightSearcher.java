package com.kodilla.good.patterns.challenges.flight.services;

import com.kodilla.good.patterns.challenges.flight.data.Airport;
import com.kodilla.good.patterns.challenges.flight.data.AirportRequirements;
import com.kodilla.good.patterns.challenges.flight.data.FlightWithTransfer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearcher implements FlightSearcherService {

    public boolean prepareFlightList() {
        Airport warsaw = new Airport("Warsaw");
        Airport london = new Airport("London");
        Airport berlin = new Airport("Berlin");
        Airport tokyo = new Airport("Tokyo");

        List<AirportRequirements> warsawDestinations = new ArrayList<>();
        warsawDestinations.add(berlin);
        warsawDestinations.add(tokyo);
        warsawDestinations.add(london);

        List<AirportRequirements> londonDestinations = new ArrayList<>();
        londonDestinations.add(warsaw);

        List<AirportRequirements> berlinDestinations = new ArrayList<>();
        berlinDestinations.add(london);

        List<AirportRequirements> tokyoDestinations = new ArrayList<>();
        tokyoDestinations.add(warsaw);
        tokyoDestinations.add(berlin);

        flightsMap.put(warsaw,warsawDestinations);
        flightsMap.put(london,londonDestinations);
        flightsMap.put(berlin,berlinDestinations);
        flightsMap.put(tokyo,tokyoDestinations);

        return true;
    }

    @Override
    public List<AirportRequirements> getAllFlightsFromAirport(AirportRequirements departureAirport) {
         return flightsMap.get(departureAirport);
    }

    @Override
    public List<AirportRequirements> getAllFlightsToAirport(AirportRequirements arrivalAirport) {
        return flightsMap.entrySet().stream()
                .filter(entry -> entry.getValue().contains(arrivalAirport))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    @Override
    public List<FlightWithTransfer> flightSearcher(AirportRequirements departureAirport, AirportRequirements destinationAirport) {
        Map<AirportRequirements,List<AirportRequirements>> flightsMapClone = new HashMap<>();
        List<FlightWithTransfer> availableFlightsWithTransfer = new ArrayList<>();

        for (Map.Entry<AirportRequirements, List<AirportRequirements>> entryElement : flightsMap.entrySet()) {
            flightsMapClone.put(entryElement.getKey(),entryElement.getValue());
        }

        if (flightsMapClone.entrySet().stream().anyMatch(entry -> entry.getValue().contains(destinationAirport))) {
            if (flightsMapClone.get(departureAirport).contains(destinationAirport)) {
                availableFlightsWithTransfer.add(new FlightWithTransfer(departureAirport,departureAirport));
                flightsMapClone.get(departureAirport).remove(destinationAirport);
            }
            flightsMapClone.get(departureAirport).stream()
                    .filter(e -> flightsMapClone.get(e).contains(destinationAirport))
                    .forEach(e -> availableFlightsWithTransfer.add(new FlightWithTransfer(departureAirport,e)));
        }

        flightsMap.get(departureAirport).add(destinationAirport);
        return availableFlightsWithTransfer;
    }
}