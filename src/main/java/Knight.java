import java.util.concurrent.ThreadLocalRandom;

public class Knight extends Warrior {
    private Hit hit = new Sword();

    public Knight() {
        super(ThreadLocalRandom.current().nextInt(2, 21 + 1), ThreadLocalRandom.current().nextInt(2, 12 + 1));
    }

    public void kick(Character c) {
        hit.kick(this, c);
    }
}