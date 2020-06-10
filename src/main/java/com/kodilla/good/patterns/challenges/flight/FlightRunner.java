package com.kodilla.good.patterns.challenges.flight;

import com.kodilla.good.patterns.challenges.flight.data.Airport;
import com.kodilla.good.patterns.challenges.flight.services.FlightSearcher;

public class FlightRunner {
    public static void main(String args[]) {
        Airport warsaw = new Airport("Warsaw");
        Airport london = new Airport("London");
        Airport berlin = new Airport("Berlin");
        Airport tokyo = new Airport("Tokyo");

        FlightSearcher flightSearcher = new FlightSearcher();
        flightSearcher.prepareFlightList();

        System.out.println(flightSearcher.getAllFlightsToAirport(warsaw));
        System.out.println(flightSearcher.getAllFlightsFromAirport(warsaw));

        System.out.println(flightSearcher.flightSearcher(warsaw,berlin));
        System.out.println(flightSearcher.flightSearcher(warsaw,berlin));
        System.out.println(flightSearcher.flightSearcher(warsaw,berlin));
        System.out.println(flightSearcher.flightSearcher(warsaw,berlin));
    }
}
