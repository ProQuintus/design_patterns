import java.time.LocalTime;

/**
 * Represents a flight with its details.
 * @author Neerattr
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Constructs a Flight object with the given details.
     * @param flightNum the flight number
     * @param from the departure airport
     * @param to the arrival airport
     * @param startTime the start time of the flight
     * @param endTime the end time of the flight
     * @param numTransfers the number of transfers
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * Returns the departure airport.
     * @return the departure airport
     */
    public Airport getFrom() {
        return from;
    }

    /**
     * Returns the arrival airport.
     * @return the arrival airport
     */
    public Airport getTo() {
        return to;
    }

    /**
     * Checks if the flight is between the given airports.
     * @param from the departure airport to check
     * @param to the arrival airport to check
     * @return true if the flight is between the given airports, false otherwise
     */
    public boolean sameLoc(Airport from, Airport to) {
        return this.from == from && this.to == to;
    }

    /**
     * Returns a string representation of the flight.
     * @return a string representation of the flight
     */
    public String toString() {
        String transferInfo = (numTransfers == 0) ? "Direct Flight" : (numTransfers == 1) ? "1 Stopover" : numTransfers + " Transfers";

        long flightDuration = java.time.Duration.between(startTime, endTime).toMinutes();
        long hours = flightDuration / 60;
        long minutes = flightDuration % 60;

        return String.format("%s to %s %02d:%02d - %02d:%02d (%dh %dm) %s", from, to, startTime.getHour(), startTime.getMinute(), endTime.getHour(), endTime.getMinute(), hours, minutes, transferInfo);
    }
}
