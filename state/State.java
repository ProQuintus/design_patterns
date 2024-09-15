/**
 * Represents a state in the ArithmeticGame.
 * @author neerattr
 */
public interface State {
    /**
     * Generates a random number based on the current difficulty level.
     */
    public int getNum();
    /**
     * Selects an arithmetic operation based on the current difficulty level.
     */
    public Operation getOperation();
    /**
     * Increases the difficulty level of the game.
     */
    public void increaseDifficulty();
    /**
     * Decreases the difficulty level of the game.
     */
    public void decreaseDifficulty();
}
