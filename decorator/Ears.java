import java.util.ArrayList;
/**
 * Decorator class for ears
 * @author neerattr
 */
public class Ears extends CharacterDecorator{
    /**
     * Constructor for ears decorator for character
     * @param character to be decorated
     */
    public Ears (Character character) {
        super(character);
        ArrayList <String> Ears = FileReader.getLines("decorator/txt/ears.txt");
        integrateDecor(Ears);
    }
}
