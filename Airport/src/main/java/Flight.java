public class Flight {

    private Destination destination;
    private Plane plane;
    private String flightNo;


    //constructor
    public Flight(String flightNo, Plane plane, Destination destination) {
        this.destination = destination;
        this.plane = plane;
        this.flightNo = flightNo;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public Destination getDestination() {
        return this.destination;
    }

    public String getFlightNo() {
        return this.flightNo;
    }
}
