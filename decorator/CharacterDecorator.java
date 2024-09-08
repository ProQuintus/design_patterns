import java.util.ArrayList;
/**
 * Absctract decorator class that adds functionality to Character
 * @author neerattr
 */
public abstract class CharacterDecorator extends Character{
    private Character character;
    /**
     * Constructor for CharacterDecorator
     * @param character to be decorated
     */
    public CharacterDecorator(Character character) {
        super(character.lines,character.getName());
        this.character = character;
    }
    /**
     * Integrates decor changes to the character
     * @param decor list to be integrated
     */
    protected void integrateDecor(ArrayList<String> decor) {
        for (int i = 0; i < decor.size(); i++) {
            String decorLine = decor.get(i);
            if (i < lines.size()) {
                StringBuilder sb = new StringBuilder(lines.get(i));
                for (int j = 0; j < decorLine.length(); j++) {
                    if (j < sb.length() && decorLine.charAt(j) != ' ') {
                        sb.setCharAt(j, decorLine.charAt(j));
                    } else if (j >= sb.length()) {
                        sb.append(decorLine.charAt(j));
                    }
                }
                lines.set(i, sb.toString());
            } else {
                lines.add(decorLine);
            }
        }
    }
}
