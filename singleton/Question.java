import java.util.ArrayList;
import java.util.Arrays;

/**
 * Represents a trivia question with multiple answers.
 * @author neerattr
 */
public class Question {
    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;
    /**
     * Constructs a Question object with the given parameters.
     * @param question The question text
     * @param correctAnswer The index of the correct answer
     * @param answers Variable number of answer options
     */
    public Question(String question, int correctAnswer, String... answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<>(Arrays.asList(answers));
    }
    /**
     * Returns a string representation of the question and its answers.
     * @return A formatted string containing the question and numbered answers
     */
    public String toString() {
        String result = "\n" + question + "\n";
        for (int i = 0; i < answers.size(); i++) {
            result += " " + (i + 1) + ". " + answers.get(i) + "\n";
        }
        return result;
    }
    /**
     * Checks if the given answer is correct.
     * @param userAnswer The user's answer (1-based index)
     * @return true if the answer is correct, false otherwise
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer - 1 == correctAnswer;
    }
    /**
     * Gets the correct answer for the question.
     * @return The correct answer as a string
     */
    public String getCorrectAnswer() {
        return answers.get(correctAnswer);
    }
}
