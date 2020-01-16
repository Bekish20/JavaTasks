package collections;
import collections.carType.PassengerMiniBusesType;


public class PassangerMiniBuses extends Car {
    private PassengerMiniBusesType type;

    public PassangerMiniBuses(String carModel, int carFuelСonsumption, int carCost, int carMaxSpeed, PassengerMiniBusesType type) {
        super(carModel, carFuelСonsumption, carCost, carMaxSpeed);
        this.type=type;
    }
    public PassengerMiniBusesType getType(){
        return type;
    }
    public void setType(PassengerMiniBusesType type){
        this.type=type;
    }
    @Override
    public String toString() {
        return super.toString().replace(".",
                ", type=" + type );
    }
}
