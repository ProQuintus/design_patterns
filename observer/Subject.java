package observer;
/**
 * Interface for observer functions
 * @author neerattr
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Book book);
}
