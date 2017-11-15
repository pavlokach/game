import java.util.concurrent.ThreadLocalRandom;

public class King extends Warrior {
    private Hit hit = new Sword();

    public King() {
        super(ThreadLocalRandom.current().nextInt(5, 15 + 1), ThreadLocalRandom.current().nextInt(5, 15 + 1));

    }

    public void kick(Character c) {
        hit.kick(this, c);
    }

    public void setHp(int hp) {
        super.setHp(hp);
    }

    public void setPower(int power) {
        super.setPower(power);
    }


}
