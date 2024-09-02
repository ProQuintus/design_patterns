package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages list of bestsellers and observer changes
 * @author neerattr
 */
public class BestSellers implements Subject {
    private List<Observer> observers;
    private List<Book> bestSellers;
    
    /**
     * Initializes list for observers and bestsellers
     */
    public BestSellers() {
        observers = new ArrayList<>();
        bestSellers = new ArrayList<>();
    }
    
    /**
     * Registers an observer
     * @param observer the observer to register
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    
    /**
     * Removes an observer
     * @param observer the observer to remove
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    /**
     * Notifies all observers about new book
     * @param book the book to notify observers about
     */
    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }
    
    /**
     * Adds book to bestsellers list and notifies observers
     * @param title title of book
     * @param genre genre of book
     * @param authorFirstName first name of author
     * @param authorLastName last name fo author
     * @param description description of book
     */
    public void addBook(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        Book book = new Book(title, genre, authorFirstName, authorLastName, description);
        if (bestSellers.size() >= 5) {
            bestSellers.remove(0);
        }
        bestSellers.add(book);
        notifyObservers(book);
    }
}
