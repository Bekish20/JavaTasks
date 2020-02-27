package collections;

import collections.carType.PassengerCarType;
import collections.carType.PassengerMiniBusesType;
import collections.TaxiPark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    static List<Car> taxi = Arrays.asList(
            new PassengerCar("Audi-A4", 10, 7500, 250, PassengerCarType.COMFORT),
            new PassengerCar("Shkoda-Rapid", 5, 6400, 200, PassengerCarType.ECONOMY),
            new PassengerCar("Volkswagen-Polo", 5, 6200, 200, PassengerCarType.ECONOMY),
            new PassengerCar("Volkswagen-Passat", 6, 7600, 250, PassengerCarType.COMFORTPLUS),
            new PassengerCar("Volkswagen-Golf-GTI", 5, 7100, 250, PassengerCarType.CHILDRENS),
            new PassengerCar("Volkswagen-Touran", 6, 8200, 200, PassengerCarType.MINIVAN),
            new PassengerCar("Shkoda-Oktavia", 6, 7500, 250, PassengerCarType.COMFORT),
            new PassengerCar("Audi-A7", 6, 15600, 300, PassengerCarType.BUSINESS),
            new PassengerCar("Shkoda-Fabia", 5, 6700, 200, PassengerCarType.ECONOMY),
            new PassengerCar("Toyota-Avensis-3", 6, 10950, 300, PassengerCarType.BUSINESS),
            new PassengerCar("Toyota-RAV4", 6, 21500, 250, PassengerCarType.COMFORTPLUS),
            new PassangerMiniBuses("Volkswagen-Crafter", 6, 21500, 250,
                    PassengerMiniBusesType.ROUTETAXI),
            new PassangerMiniBuses("Mercedes-Benz Sprinter ", 6, 21000, 200,
                    PassengerMiniBusesType.ROUTETAXI),
            new PassangerMiniBuses("Neoplan N216", 8, 12000, 200,
                    PassengerMiniBusesType.INTERNATIONAL),
            new PassangerMiniBuses("Mercedes-Benz O-series", 8, 15000, 200,
                    PassengerMiniBusesType.INTERNATIONAL)
    );

    public static void main(String[] args) {
        int cost = 0;
        TaxiPark taxiPark = new TaxiPark(taxi);
        TaxiPark passengerTaxiCar = new TaxiPark(taxiPark.getPassengerCar());
        TaxiPark passengerBuses = new TaxiPark(taxiPark.getPassangerMiniBuses());
        System.out.println("Taxi cars sorted by max fuel consumption: " + passengerTaxiCar
                .sortByFuelСonsumption()
                .toString());
        System.out.println("Taxi buses sorted by max fuel consumption: " + passengerBuses
                .sortByFuelСonsumption()
                .toString());
        System.out.println("Taxi car with max speed: " + passengerTaxiCar.getPassengerCarWithMaxSpeed().toString());
        System.out.println("Taxi bus with max speed: " + passengerBuses.getPassengerBusWithMaxSpeed().toString());
        System.out.println("Taxipark  cost : " + (cost = passengerTaxiCar.getPassengerCarCost()
                + passengerBuses.getPassengerBusCost()));
    }
}



