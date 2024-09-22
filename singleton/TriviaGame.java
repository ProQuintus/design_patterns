import java.util.ArrayList;
import java.util.Random;

/**
 * Represents a Trivia Game with questions and scoring.
 * @author neerattr
 */
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;
    /**
     * Private constructor for TriviaGame.
     */
    private TriviaGame() {
        score = 0;
        numGames = 0;
        rand = new Random();
        questions = DataLoader.getTriviaQuestions();
    }
    /**
     * Returns the singleton instance of TriviaGame.
     * @return The TriviaGame instance
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }
    /**
     * Retrieves and removes a random question from the list.
     * @return A random Question object
     */
    public Question getQuestion() {
        int randomIndex = rand.nextInt(questions.size());
        
        return questions.remove(randomIndex);
    }
    /**
     * Checks if there are more questions available.
     * @return true if there are more questions, false otherwise
     */
    public boolean hasMoreQuestions() {
        return !questions.isEmpty();
    }
    /**
     * Increments the score and number of games played.
     */
    public void winRound() {
        score++;
        numGames++;
    }
    /**
     * Increments only the number of games played.
     */
    public void loseRound() {
        numGames++;
    }
    /**
     * Returns the current score as a formatted string.
     * @return A string representation of the current score
     */
    public String getScores() {
        return "You scored " + score + "/" + numGames;
    }
}
