public class Mage extends Character {
    private int heal;

    public Mage(int inputHP, int inputPower) {
        super(inputHP, inputPower);
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int inputHeal) {
        this.heal = inputHeal;
    }
}
