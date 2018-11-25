import java.util.ArrayList;

public class Plane {

    private PlaneType type;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType type, String airline) {
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public int checkPassSize() {
        return this.passengers.size();
    }

    public PlaneType getType() {
        return this.type;
    }

    public String getAirline() {
        return this.airline;
    }

    public ArrayList<Passenger> getPassengerCount() {
        return this.passengers;
    }

    public int getCapacity() {
        return this.type.getCapacity();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }
}