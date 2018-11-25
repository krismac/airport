import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    //instance variables
    Passenger passenger;
    Plane plane;

    //objects for test
    @Before
    public void before(){
        passenger = new Passenger();
        plane = new Plane(PlaneType.BOEING737, "Ryanair");
    }

    //get plane type
    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING737, plane.getType());
    }

    //get airline
    @Test
    public void canGetAirline(){
        assertEquals("Ryanair", plane.getAirline());
    }

    //get passengers collection
    @Test
    public void canGetPassengersCollection() {
        assertEquals(0, plane.getPassengerCount());
    }

     //get plane capacity
        @Test
        public void canGetPlaneCapacity(){
            assertEquals(189, plane.getCapacity());
        }

        //add passengers to plane
        @Test
        public void canAddPassengers(){
            plane.addPassenger(passenger);
            assertEquals(1, plane.getPassengerCount());
        }

}
