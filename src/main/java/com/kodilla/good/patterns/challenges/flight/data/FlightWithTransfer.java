package com.kodilla.good.patterns.challenges.flight.data;

import java.util.Objects;

public class FlightWithTransfer {
    private AirportRequirements departureAirport;
    private AirportRequirements transferAirport;

    public FlightWithTransfer(AirportRequirements departureAirport, AirportRequirements transferAirport) {
        this.departureAirport = departureAirport;
        this.transferAirport = transferAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightWithTransfer that = (FlightWithTransfer) o;
        return departureAirport.equals(that.departureAirport) &&
                transferAirport.equals(that.transferAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, transferAirport);
    }

    @Override
    public String toString() {
        if (departureAirport.equals(transferAirport)) {
            return "Dolecisz bez przesiadki z " + departureAirport;
        } else {
            return "Wylecisz z lotniska w " + departureAirport +
                    " i przelecisz przez " + transferAirport;
        }
    }

    public AirportRequirements getDepartureAirport() {
        return departureAirport;
    }

    public AirportRequirements getTransferAirport() {
        return transferAirport;
    }
}
