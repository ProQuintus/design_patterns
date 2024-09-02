package observer;

/**
 * Book class with traits like title, genre, author, description
 * @author neerattr
 */
public class Book {
    private String title;
    private Genre genre;
    private String authorFirstName;
    private String authorLastName;
    private String description;

    /**
     * Constructor for book
     * @param title of book
     * @param genre of book
     * @param authorFirstName of book
     * @param authorLastName of book
     * @param description of book
     */
    public Book(String title, Genre genre, String authorFirstName, String authorLastName, String description) {
        this.title = title;
        this.genre = genre;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.description = description;
    }

    /**
     * getter for title
     * @return the title of book
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * getter for genre
     * @return the genre of book
     */
    public Genre getGenre() {
        return genre;
    }
    
    /**
     * getter for author first name
     * @return the first name of author
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }
    
    /**
     * getter for author last name
     * @return the last name of author
     */
    public String getAuthorLastName() {
        return authorLastName;
    }
    
    /**
     * getter for description
     * @return the description of book
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * ToString for book
     * @return string formatted to output
     */
    @Override
    public String toString() {
        return "----- " + title + "-----\n" + genre.label + " by: " + authorFirstName + " " + authorLastName + "\n" + description + "\n";
    }
}
