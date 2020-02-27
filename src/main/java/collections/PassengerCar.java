package collections;

import collections.carType.PassengerCarType;
import collections.Car;

import java.util.Objects;

public class PassengerCar extends Car {
    private PassengerCarType type;

    public PassengerCar(String carModel, int carFuelСonsumption, int carCost, int carMaxSpeed, PassengerCarType type) {
        super(carModel, carFuelСonsumption, carCost, carMaxSpeed);
        this.type = type;
    }

    public PassengerCarType getType() {
        return type;
    }

    public void setType(PassengerCarType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString().replace(".", ", type=" + type);
    }
}

