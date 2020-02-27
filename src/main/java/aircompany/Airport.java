package aircompany;

import aircompany.planes.ExperimentalPlane;
import aircompany.models.MilitaryType;
import aircompany.planes.MilitaryPlane;
import aircompany.planes.PassengerPlane;
import aircompany.planes.Plane;

import java.util.*;
import java.util.stream.Collectors;

// version: 1.1
// made by Vitali Shulha
// 4-Jan-2019

public class Airport {
    private List<? extends Plane> planes;

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) passengerPlanes.add((PassengerPlane) plane);
        }
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) militaryPlanes.add((MilitaryPlane) plane);
        }
        return militaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) experimentalPlanes.add((ExperimentalPlane) plane);
        }
        return experimentalPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        return getPassengerPlanes().stream()
                .max(Comparator.comparingInt(PassengerPlane::getPassengersCapacity))
                .get();
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        return getMilitaryPlanes().stream()
                .filter(x -> x.getType() == MilitaryType.TRANSPORT)
                .collect(Collectors.toList());
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        return getMilitaryPlanes().stream()
                .filter(x -> x.getType() == MilitaryType.BOMBER)
                .collect(Collectors.toList());
    }

    public List<? extends Plane> sortByFlightDistance() {
        return planes.stream()
                .sorted(Comparator.comparingInt(x -> x.getMaxFlightDistance()))
                .collect(Collectors.toList());
    }

    public List<? extends Plane> sortByMaxSpeed() {
        return planes.stream()
                .sorted(Comparator.comparingInt(x -> x.getMaxSpeed()))
                .collect(Collectors.toList());
    }

    public List<? extends Plane> sortByMaxLoadCapacity() {
        return planes.stream()
                .sorted(Comparator.comparingInt(x -> x.getMaxLoadCapacity()))
                .collect(Collectors.toList());
    }

    public void print(List a) {
        a.stream().forEach(x -> System.out.println(x));
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes +
                '}';
    }
}
