package strategy;

import java.util.List;
/**
 * Linear search implementation of SearchBehavior
 * @author neerattr
 */
public class LinearSearch implements SearchBehavior {
    /**
     * Searches for a person in a list using linear search
     * @param people list of people
     * @param personToFind person to search for
     * @return true if person in list, else false
     */
    @Override
    public boolean contains(List<Person> people, Person personToFind) {
        for (Person person : people) {
            if (person.equals(personToFind)) {
                return true;
            }
        }
        return false;
    }
}
