import java.util.ArrayList;
/**
 * Represents a character with a name and arraylist of ascii art
 * @author neerattr
 */
public abstract class Character {
    private String name;
    protected ArrayList<String> lines;
    /**
     * constructor for Character obj
     * @param lines arraylist that stores potato head
     * @param name name of potato head
     */
    public Character(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }
    /**
     * gets the name of character object
     * @return string name of obj
     */
    public String getName() {
        return this.name;
    }
    /**
     * string output for the program
     * @return the string output
     */
    public String toString() {
        String output = "----- " + name + " -----\n";
        for(int i = 0; i < lines.size(); i++) {
            output+=lines.get(i)+"\n";
        }
        return output;
    }
}
