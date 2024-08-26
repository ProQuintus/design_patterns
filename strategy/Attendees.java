package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * A collection of people in attendance
 * @author neerattr
 */
public class Attendees {
    private String title;
    private List<Person> people;
    private SearchBehavior searchBehavior;
    /**
     * Constructor for attendees
     * @param title title of list
     * @param people list of people
     */
    public Attendees(String title) {
        this.title = title;
        this.people = new ArrayList<>();
    }
    /**
     * Adds a person to the attendees list if they are not already present
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param phoneNumber the phone number of the person
     * @param reminder a reminder for the person
     * @return the new Person object, if already in list, returns null
     */
    public Person add(String firstName, String lastName, String phoneNumber, String reminder) {
        Person person = new Person(firstName, lastName, phoneNumber, reminder);
        if (!people.contains(person)) {
            people.add(person);
            return person;
        }
        return null;
    }
    /**
     * Returns the title of the list
     * @return title of list
     */
    public String getTitle() {
        return title;
    }
    /**
     * Sets search behavior for list
     * @param searchBehavior the search behavior
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }
    /**
     * Sorts list
     * @return list of people
     */
    public List<Person> getList() {
        Collections.sort(people);
        return people;
    }
}
