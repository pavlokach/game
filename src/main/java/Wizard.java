import java.util.concurrent.ThreadLocalRandom;

public class Wizard extends Mage {
    private Bewitch bewitch = new WizardStuff();

    public Wizard() {
        super(ThreadLocalRandom.current().nextInt(10, 23 + 1), ThreadLocalRandom.current().nextInt(3, 6 + 1));
        setHeal(ThreadLocalRandom.current().nextInt(5, 8 + 1));
    }

    public void kick(Character c) {
        bewitch.castSpell(this, c);
    }

    public int getHeal() {
        return super.getHeal();
    }

    public void setHeal(int inputHeal) {
        super.setHeal(inputHeal);
    }

    public void setHp(int hp) {
        super.setHp(hp);
    }

    public void setPower(int power) {
        super.setPower(power);
    }
}
