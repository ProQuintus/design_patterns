import java.util.ArrayList;
/**
 * Decorator class for hat
 * @author neerattr
 */
public class Hat extends CharacterDecorator{
    /**
     * Constructor for hat decorator for character
     * @param character to be decorated
     */
    public Hat (Character character) {
        super(character);
        ArrayList <String> Hat = FileReader.getLines("decorator/txt/hat.txt");
        integrateDecor(Hat);
    }
}
