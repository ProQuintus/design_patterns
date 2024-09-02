package observer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A reader's collection of book reccomendations by genre
 * @author neerattr
 */
public class FanReads implements Observer {
    private Subject subject;
    private HashMap<Genre, ArrayList<Book>> recommendations;

    /**
     * 
     * @param subject to observer
     * @param firstName of the reader
     * @param lastName of the reader
     */
    public FanReads(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.recommendations = new HashMap<>();
        subject.registerObserver(this);
    }

    /**
     * Updates recommendations with new book
     * @param book to add
     */
    @Override
    public void update(Book book) {
        recommendations.putIfAbsent(book.getGenre(), new ArrayList<>());
        recommendations.get(book.getGenre()).add(book);
    }

    /**
     * returns list of bok reccomendations
     * @param genre to get reccomendations for
     * @return list of reccomended books
     */
    public ArrayList<Book> getRecommendations(Genre genre) {
        return new ArrayList<>(recommendations.getOrDefault(genre, new ArrayList<>()));
    }
}