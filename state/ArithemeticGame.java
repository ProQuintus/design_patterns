/**
 * Represents an arithmetic game with different difficulty states.
 * @author neerattr
 */
public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score=0;
    /**
     * Constructs an ArithemeticGame with states and score
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        score = 0;
    }
    /**
     * Generates a new question based on the current state
     * @return A new Question object
     */
    public Question getQuestion() {
        return new Question(state.getNum(), state.getNum(), state.getOperation());
    }
    /**
     * Increases the score and adjusts difficulty
     */
    public void increaseScore() {
        score++;
        if(score >= 3 && state==hardState) {
            System.out.println("Woo hoo!");
            if(score==3) {
                state.increaseDifficulty();
            }
        }
        if(score == 3 && state!=hardState) {
            state.increaseDifficulty();
            score = 0;
        }
    }
    /**
     * Decreases the score and adjusts difficulty
     */
    public void decreaseScore() {
        score--;
        if(score <= -3 && state==easyState) {
            System.out.println("Keep trying!");
            if(score==-3) {
                state.decreaseDifficulty();
            }
        }
        if(score == -3 && state!=easyState) {
            state.decreaseDifficulty();
            score = 0;
        }
    }
    /**
     * Sets the current state of the game
     * @param state The new state to set
     */
    public void setState(State state) {
        this.state = state;
    }
    /**
     * Gets the easy state of the game
     * @return The easy state
     */
    public State getEasyState() {
        return easyState;
    }
    /**
     * Gets the medium state of the game
     * @return The medium state
     */
    public State getMediumState() {
        return mediumState;
    }
    /**
     * Gets the hard state of the game
     * @return The hard state
     */
    public State getHardState() {
        return hardState;
    }
}
