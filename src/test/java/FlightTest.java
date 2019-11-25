import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUS);
        flight = new Flight(plane, 302, "EDI", "GLA", "9 O'clock");
        passenger1 = new Passenger("Elliot", 2);
        passenger2 = new Passenger("Zsolt", 1);
        passenger3 = new Passenger("Cameron", 2);
        passenger4 = new Passenger("Freezer", 2);
    }

    @Test
    public void planeStartsEmpty() {
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger1);
        assertEquals(1, flight.passengerCount());
    }

    @Test
    public void canReturnRemainingSeats() {
        flight.addPassenger(passenger1);
        assertEquals(2, flight.remainingSeatCount());
    }

    @Test
    public void cannotAddPassengerAboveCapacity() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(3, flight.passengerCount());
        flight.addPassenger(passenger4);
        assertEquals(3, flight.passengerCount());
    }

}