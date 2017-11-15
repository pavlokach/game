public abstract class Character {
    private int hp;
    private int power;

    public Character(int inputHP, int inputPower) {
        setHp(inputHP);
        setPower(inputPower);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void kick(Character c) {
    }

    @Override
    public String toString() {
        return this.getClass().toString().substring(6)
                + " with "
                + getHp()
                + " HP and the power of "
                + getPower();
    }
}
