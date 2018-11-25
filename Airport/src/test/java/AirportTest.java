import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AirportTest {

    Airport airport;
    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void before(){
        airport = new Airport("EDH");
        flight = new Flight("G747", plane, Destination.DUBLIN);
        plane = new Plane(PlaneType.BOEING737, "Ryanair");
    }

    //airport has an ID

    @Test
    public void hasAirporthasID(){
        assertEquals("EDH", airport.getID());

    }

    //airport has a hangar with planes
    @Test
    public void hasAirportGotHangar(){
        assertEquals(0, airport.checkHangarhasPlanes());
    }

    //add plane to hangar
    @Test
    public void canAddPlaneToHanger(){
        airport.addPlane(plane);
        assertEquals(1, airport.checkHangarhasPlanes());
    }

    //create flight
    @Test
    public void canCreateFlight() {
        airport.addPlane(plane);

        Flight flight1 = airport.createFlight(Destination.LONDON, "L100", plane);
        assertEquals(1, airport.checkHangarhasPlanes());

        Flight newFlight = new Flight ("L100", plane, Destination.LONDON);
        assertEquals(true, flight1.getFlightNo() == newFlight.getFlightNo());
    }


    //can sell tickets for flights
    @Test
        public void canSellTicket (){
            airport.sellTicket(flight, passenger);
            assertEquals(1, plane.checkPassSize());
        }
    }
