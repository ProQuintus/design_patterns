package observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Store that tracks bestsellers
 * @author neerattr
 */
public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * Constructor for store, registers observer
     * @param subject to observe
     */
    public Store(Subject subject) {
        this.subject = subject;
        this.bestSellers = new LinkedList<>();
        subject.registerObserver(this);
    }

    /**
     * Updates store's bestsellers
     * @param book new book to add
     */
    @Override
    public void update(Book book) {
        if (bestSellers.size() >= 5) {
            bestSellers.poll();
        }
        bestSellers.add(book);
    }

    /**
     * Returns list of store's bestsellers
     * @return list ^
     */
    public List<Book> getBestSellers() {
        return new ArrayList<>(bestSellers);
    }
}
