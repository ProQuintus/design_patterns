import java.util.ArrayList;
/**
 * Decorator class for eyes
 * @author neerattr
 */
public class Eyes extends CharacterDecorator{
    /**
     * Constructor for eyes decorator for character
     * @param character to be decorated
     */
    public Eyes (Character character) {
        super(character);
        ArrayList <String> Eyes = FileReader.getLines("decorator/txt/eyes.txt");
        integrateDecor(Eyes);
    }
}
