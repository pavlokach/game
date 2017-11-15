import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CharacterFactory creator = new CharacterFactory();


        GameManager admin = new GameManager();
        admin.fight(creator.createCharacter(), creator.createCharacter());

    }
}
