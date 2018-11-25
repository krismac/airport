import java.util.ArrayList;

public class Airport {

    //instance
    private String code;
    private ArrayList<Plane> hangar;

    //constructor
    public Airport(String code) {
        this.code = code;
        this.hangar = new ArrayList<>();
    }

    public Object getID() {
        return this.code;
    }

    public int checkHangarhasPlanes() {
        return this.hangar.size();
    }

    public void addPlane(Plane plane) {
        this.hangar.add(plane);
    }

    public void sellTicket(Flight flight, Passenger passenger) {
        Plane plane = flight.getPlane();
        if (plane.getCapacity() > plane.checkPassSize()) {
            plane.addPassenger(passenger);
        }
    }

    public Flight createFlight(Destination destination, String flightNo, Plane plane) {
        Flight flight = new Flight(flightNo, plane, destination);
        this.removePlane(plane);
        return flight;
    }

    private void removePlane(Plane plane) {
        this.hangar.remove(plane);
    }
}
