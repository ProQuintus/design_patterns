import java.util.ArrayList;
/**
 * Decorator class for nose
 * @author neerattr
 */
public class Nose extends CharacterDecorator{
    /**
     * Constructor for nose decorator for character
     * @param character to be decorated
     */
    public Nose (Character character) {
        super(character);
        ArrayList <String> Nose = FileReader.getLines("decorator/txt/nose.txt");
        integrateDecor(Nose);
    }
}
