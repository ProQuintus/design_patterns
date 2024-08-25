package strategy;

import java.util.List;
/**
 * Interface for searching a list of people
 * @author neerattr
 */
public interface SearchBehavior {
    /**
     * Abstract method to search for a person within a list
     * @param people the list of people
     * @param personToFind person to search for
     * @return Boolean on if the person is in the list
     */
    boolean searchList(List<Person> people, Person personToFind);
}
