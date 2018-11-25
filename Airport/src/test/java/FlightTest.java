import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        flight = new Flight("D100", plane, Destination.DUBLIN);
        plane = new Plane(PlaneType.AIRBUSA320, "AERLINGUS");

    }

    //has plane
    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }

    //has flight no
    @Test
    public void canGetFlightNo(){
        assertEquals("D100", flight.getFlightNo());
    }

    //flight has destination
    @Test
    public void canGetDestination(){
        assertEquals(Destination.DUBLIN, flight.getDestination());
    }
}
