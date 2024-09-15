/**
 * Represents the Easy difficulty state in ArithemeticGame
 * @author neerattr
 */
public class Easy implements State {
    private ArithemeticGame game;
    /**
     * Constructs a Easy state
     * @param game The ArithmeticGame instance
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }
    /**
     * Generates a random number between 1 and 10
     * @return said number
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 10) + 1;
    }
    /**
     * Randomly selects an arithmetic operation
     * @return A randomly selected Operation
     */
    @Override
    public Operation getOperation() {
        return Math.random() < 0.5 ? Operation.PLUS : Operation.MINUS;
    }
    /**
     * Increases the difficulty to Medium
     */
    @Override
    public void increaseDifficulty() {
        System.out.println("Level Increased to: Medium");
        game.setState(game.getMediumState());
    }
    /**
     * Notifies that the min level has been reached
     */
    @Override
    public void decreaseDifficulty() {
        System.out.println("You are at the lowest level.");
    }
}
