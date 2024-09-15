/**
 * Represents an arithmetic question with an operation and two numbers.
 * @author neerattr
 */
public class Question {
    private String question;
    private int answer;
    /**
     * Constructs a Question object with two numbers and an operation.
     * @param num1 The first number in the question.
     * @param num2 The second number in the question.
     * @param operation The arithmetic operation to be performed.
     */
    public Question(int num1, int num2, Operation operation) {
        switch (operation) {
            case PLUS:
                question = num1 + " + " + num2;
                answer = num1 + num2;
                break;
            case MINUS:
                question = num1 + " - " + num2;
                answer = num1 - num2;
                break;
            case MULTIPLY:
                question = num1 + " * " + num2;
                answer = num1 * num2;
                break;
            case DIVIDE:
                question = num1 + " / " + num2;
                answer = num1 / num2; // Integer division
                break;
        }
    }
    /**
     * Returns the question as a string
     * @return The question string
     */
    public String toString() {
        return question;
    }
    /**
     * Gets the correct answer to the question
     * @return The correct answer
     */
    public int getAnswer() {
        return answer;
    }
    /**
     * Checks if the user's answer is correct
     * @param userAnswer The user's answer to check
     * @return true if the user's answer is correct, false otherwise
     */
    public boolean isCorrect(int userAnswer) {
        return userAnswer == answer;
    }
}
