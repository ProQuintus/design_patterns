/**
 * Represents the Medium difficulty state in ArithmeticGame
 * @author neerattr
 */
public class Medium implements State {
    private ArithemeticGame game;
    /**
     * Constructs a Medium state
     * @param game The ArithmeticGame instance
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }
    /**
     * Generates a random number between 1 and 25
     * @return said number
     */
    @Override
    public int getNum() {
        return (int) (Math.random() * 25) + 1;
    }
    /**
     * Randomly selects an arithmetic operation
     * @return A randomly selected Operation
     */
    @Override
    public Operation getOperation() {
        double rand = Math.random();
        if(rand < 0.33) return Operation.PLUS;
        else if(rand < 0.66) return Operation.MINUS;
        else return Operation.MULTIPLY;
    }
    /**
     * Increases the difficulty to Hard
     */
    @Override
    public void increaseDifficulty() {
        System.out.println("Level Increased to: Hard");
        game.setState(game.getHardState());
    }
    /**
     * Decreases the difficulty to Easy
     */
    @Override
    public void decreaseDifficulty() {
        System.out.println("Level Decreased to: Easy");
        game.setState(game.getEasyState());
    }
}
