import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

class CharacterFactory {
    Character createCharacter() {
        Character character1;
        Reflections reflections = new Reflections();
        Set<Class<? extends Character>> characters = reflections.getSubTypesOf(Character.class);
        while (true) {
            try {
                character1 = ((Class<? extends Character>) characters.toArray()[(new Random().nextInt(characters.size()))]).getConstructor().newInstance();
                return character1;
            } catch (InvocationTargetException | NoSuchMethodException | IllegalAccessException | InstantiationException e) {
            }
        }
    }
}
