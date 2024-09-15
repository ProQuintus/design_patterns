/**
 * Represents the Hard difficulty state in ArithemeticGame
 * @author neerattr
 */
public class Hard implements State {
    private ArithemeticGame game;
    /**
     * Constructs a Hard state
     * @param game The ArithmeticGame instance
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }
    /**
     * Generates a random number between 1 and 50
     * @return said number
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 50) + 1;
    }
    /**
     * Randomly selects an arithmetic operation
     * @return A randomly selected Operation
     */
    @Override
    public Operation getOperation() {
        double rand = Math.random();
        if(rand < 0.25) return Operation.PLUS;
        else if(rand < 0.5) return Operation.MINUS;
        else if(rand < 0.75) return Operation.MULTIPLY;
        else return Operation.DIVIDE;
    }
    /**
     * Notifies that the max level has been reached
     */
    @Override
    public void increaseDifficulty() {
        System.out.println("You are at the max level!");
    }
    /**
     * Decreases the difficulty to Medium
     */
    @Override
    public void decreaseDifficulty() {
        System.out.println("Level Decreased to: Medium");
        game.setState(game.getMediumState());
    }
}
