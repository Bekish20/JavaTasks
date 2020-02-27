package collections;

abstract public class Car {
    private String carModel;
    private int carFuelСonsumption;
    private int carCost;
    private int carMaxSpeed;

    public Car(String carModel, int carFuelСonsumption, int carCost, int carMaxSpeed) {
        this.carModel = carModel;
        this.carFuelСonsumption = carFuelСonsumption;
        this.carCost = carCost;
        this.carMaxSpeed = carMaxSpeed;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String CarModel) {
        this.carModel = carModel;
    }

    public int getCarFuelСonsumption() {
        return carFuelСonsumption;
    }

    public void setCarFuelСonsumption(int carFuelСonsumption) {
        this.carFuelСonsumption = carFuelСonsumption;
    }

    public int getCarCost() {
        return carCost;
    }

    public void setCarCost(int carCost) {
        this.carCost = carCost;
    }

    public int getCarMaxSpeed() {
        return carMaxSpeed;
    }

    public void setCarMaxSpeed(int carMaxSpeed) {
        this.carMaxSpeed = carMaxSpeed;
    }

    public String toString() {
        return "Model:" + carModel +
                " Fuel consumption:" + carFuelСonsumption +
                " Car cost:" + carCost +
                " Max speed:" + carMaxSpeed +
                ".";
    }
}
