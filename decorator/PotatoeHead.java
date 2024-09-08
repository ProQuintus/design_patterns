/**
 * Represents a potatoHead character extended from Character
 * @author neerattr
 */
public class PotatoeHead extends Character {
    /**
     * Constructor for PotatoeHead
     * @param name of the PotatoeHead Character
     */
    public PotatoeHead(String name) {
        super(FileReader.getLines("decorator/txt/potatoe-head.txt"), name);
    }
}
