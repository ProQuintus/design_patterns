package strategy;

import java.util.Collections;
import java.util.List;
/**
 * Binary search implementation of SearchBehavior
 * @author neerattr
 */
public class BinarySearch implements SearchBehavior {
    /**
     * Searches for a person in a list using binary search
     * @param people list of people
     * @param personToFind person to search for
     * @return true if person in list, else false
     */
    @Override
    public boolean searchList(List<Person> people, Person personToFind) {
        Collections.sort(people);
        return Collections.binarySearch(people, personToFind) >= 0;
    }
}
