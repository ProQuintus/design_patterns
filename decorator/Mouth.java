import java.util.ArrayList;
/**
 * Decorator class for mouth
 * @author neerattr
 */
public class Mouth extends CharacterDecorator{
    /**
     * Constructor for mouth decorator for character
     * @param character to be decorated
     */
    public Mouth (Character character) {
        super(character);
        ArrayList <String> Mouth = FileReader.getLines("decorator/txt/mouth.txt");
        integrateDecor(Mouth);
    }
}
