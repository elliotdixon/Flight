import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private int flightNum;
    private String destination;
    private String departureAirport;
    private String time;

    public Flight(Plane plane, int flightNum, String destination, String departureAirport, String time) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.time = time;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public int remainingSeatCount() {
        return plane.getCapacity() - passengerCount();
    }

    public void addPassenger(Passenger passenger) {
        if (remainingSeatCount() >= 1) {
            this.passengers.add(passenger);
        }
    }
}