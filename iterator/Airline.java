import java.util.ArrayList;

/**
 * Represents an airline with its title and a list of flights.
 * @author Neerattr
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Constructs an Airline object with the given title and loads flights.
     * @param title the title of the airline
     */
    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights();
    }

    /**
     * Returns the title of the airline.
     * @return the title of the airline
     */
    public String getTitle() {
        return title;
    }

    /**
     * Creates and returns a FlightIterator for flights between the specified origin and destination airports.
     * @param fromCode the IATA code of the origin airport
     * @param toCode the IATA code of the destination airport
     * @return a FlightIterator for flights between the specified airports, or null if invalid airport codes are provided
     */
    public FlightIterator createIterator(String fromCode, String toCode) {
        Airport from, to;
        try {
            from = Airport.valueOf(fromCode.toUpperCase());
            to = Airport.valueOf(toCode.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Must enter valid airport codes");
            return null;
        }
        return new FlightIterator(flights, from, to);
    }
}
