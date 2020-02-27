
import aircompany.Airport;
import aircompany.models.ClassificationLevel;
import aircompany.models.ExperimentalTypes;
import aircompany.models.MilitaryType;
import aircompany.planes.ExperimentalPlane;
import aircompany.planes.MilitaryPlane;
import aircompany.planes.PassengerPlane;
import aircompany.planes.Plane;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

import static aircompany.models.ClassificationLevel.UNCLASSIFIED;
import static aircompany.models.MilitaryType.BOMBER;
import static aircompany.models.MilitaryType.TRANSPORT;

public class AirportTest {
    private static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, TRANSPORT),
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalTypes.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalTypes.VTOL, ClassificationLevel.TOP_SECRET)
    );


    @Test
    public void testGetTransportMilitaryPlanes() {
        Airport airport = new Airport(planes);
        boolean checkTypeOfMilitaryPlanes = airport.getTransportMilitaryPlanes().stream()
                .allMatch(x -> x.getType().equals(TRANSPORT));
        Assert.assertTrue(checkTypeOfMilitaryPlanes);
    }

    @Test
    public void testGetPassengerPlaneWithMaxPassengerCapacity() {
        Airport airport = new Airport(planes);
        int expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity()
                .getPassengersCapacity();
        boolean checkMaxPassengerCapacity = airport.getPassengerPlanes().stream()
                .allMatch(x -> x.getPassengersCapacity() <= expectedPlaneWithMaxPassengersCapacity);
        Assert.assertTrue(checkMaxPassengerCapacity);
    }

    @Test
    public void testSortedByMaxLoadCapacity() {
        Airport airport = new Airport(planes);
        List<Integer> planesSortedByMethod = airport.sortByMaxLoadCapacity().stream()
                .map(x -> ((Plane) x).getMaxLoadCapacity()).collect(Collectors.toList());
        List<Integer> checkSorting = planes.stream().map(x -> ((Plane) x).getMaxLoadCapacity())
                .sorted().collect(Collectors.toList());
        Assert.assertEquals(checkSorting, planesSortedByMethod);
    }

    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {
        Airport airport = new Airport(planes);
        boolean checkTypeOfMilitaryPlanes = airport.getBomberMilitaryPlanes().stream()
                .anyMatch(x -> x.getType().equals(BOMBER));
        Assert.assertTrue(checkTypeOfMilitaryPlanes);
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified() {
        Airport airport = new Airport(planes);
        boolean checkClassificationLevel = airport.getExperimentalPlanes().stream()
                .allMatch(x -> x.getClassificationLevel().equals(UNCLASSIFIED));
        Assert.assertFalse(checkClassificationLevel);
    }
}
