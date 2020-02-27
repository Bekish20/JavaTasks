package collections;

import java.util.*;

public class TaxiPark {
    private List<? extends Car> taxi;

    public TaxiPark(List<? extends Car> taxi) {
        this.taxi = taxi;
    }

    public List<? extends Car> getCar() {
        return taxi;
    }

    public List<PassengerCar> getPassengerCar() {
        List<PassengerCar> TaxiCar = new ArrayList<>();
        for (Car p : taxi) {
            if (p instanceof PassengerCar) {
                TaxiCar.add((PassengerCar) p);
            }
        }
        return TaxiCar;
    }

    public List<PassangerMiniBuses> getPassangerMiniBuses() {
        List<PassangerMiniBuses> MiniBuses = new ArrayList<>();
        for (Car y : taxi) {
            if (y instanceof PassangerMiniBuses) {
                MiniBuses.add((PassangerMiniBuses) y);
            }
        }
        return MiniBuses;
    }

    public TaxiPark sortByFuelСonsumption() {
        Collections.sort(taxi, new Comparator<Car>() {
            public int compare(Car o1, Car o2) {
                return o1.getCarFuelСonsumption() - o2.getCarFuelСonsumption();
            }
        });
        return this;
    }

    public PassengerCar getPassengerCarWithMaxSpeed() {
        List<PassengerCar> passengerCar = getPassengerCar();
        PassengerCar carWithMaxSpeed = passengerCar.get(0);
        for (int i = 0; i < passengerCar.size(); i++) {
            if (passengerCar.get(i).getCarMaxSpeed() > carWithMaxSpeed.getCarMaxSpeed()) {
                carWithMaxSpeed = passengerCar.get(i);
            }
        }
        return carWithMaxSpeed;
    }

    public PassangerMiniBuses getPassengerBusWithMaxSpeed() {
        List<PassangerMiniBuses> passengerBus = getPassangerMiniBuses();
        PassangerMiniBuses busWithMaxSpeed = passengerBus.get(0);
        for (int i = 0; i < passengerBus.size(); i++) {
            if (passengerBus.get(i).getCarMaxSpeed() > busWithMaxSpeed.getCarMaxSpeed()) {
                busWithMaxSpeed = passengerBus.get(i);
            }
        }
        return busWithMaxSpeed;
    }

    public int getPassengerCarCost() {
        List<PassengerCar> passengerCarCost = getPassengerCar();
        int allpassengerCarCost = 0;
        for (int i = 0; i < passengerCarCost.size(); i++) {
            allpassengerCarCost = allpassengerCarCost + passengerCarCost.get(i).getCarCost();
        }
        return allpassengerCarCost;
    }

    public int getPassengerBusCost() {
        List<PassangerMiniBuses> passengerBusCost = getPassangerMiniBuses();
        int allpassengerBusCost = 0;
        for (int i = 0; i < passengerBusCost.size(); i++) {
            allpassengerBusCost = allpassengerBusCost + passengerBusCost.get(i).getCarCost();
        }
        return allpassengerBusCost;
    }

    @Override
    public String toString() {
        return "TaxiPark{" +
                "Car=" + taxi +
                '}';
    }
}
