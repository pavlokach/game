public class Elf extends Warrior {
    private Hit hit = new MagicBow();

    public Elf() {
        super(10, 10);
    }

    public void setHp(int hp) {
        super.setHp(hp);
    }

    public void setPower(int power) {
        super.setPower(power);
    }

    public void kick(Character c) {
        hit.kick(this, c);
    }
}
