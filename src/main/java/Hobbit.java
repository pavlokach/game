public class Hobbit extends Warrior {


    public Hobbit() {
        super(3, 0);
    }

    public void setHp(int hp) {
        super.setHp(hp);
    }

    public void setPower(int power) {
        super.setPower(power);
    }

    public void kick(Character other) {
        System.out.println("I am useless");
    }


}
