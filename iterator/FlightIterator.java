import java.util.ArrayList;
import java.util.Iterator;

/**
 * An iterator for flights that filters based on origin and destination airports.
 * @author Neerattr
 */
public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    /**
     * Constructs a FlightIterator with the given list of flights and filters for flights between the specified origin and destination airports.
     * @param flights the list of flights to iterate over
     * @param from the origin airport to filter for
     * @param to the destination airport to filter for
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.position = 0;
        this.from = from;
        this.to = to;
    }
    
    /**
     * Checks if there are more flights in the iteration that match the specified origin and destination airports.
     * @return true if there are more flights to iterate over, false otherwise
     */
    @Override
    public boolean hasNext() {
        while (position < flights.size()) {
            Flight flight = flights.get(position);
            if (flight.sameLoc(from, to)) {
                return true;
            }
            position++;
        }
        return false;
    }

    /**
     * Returns the next flight in the iteration that matches the specified origin and destination airports.
     * @return the next flight in the iteration
     */
    @Override
    public Flight next() {
        Flight flight = flights.get(position);
        position++;
        return flight;
    }
}
