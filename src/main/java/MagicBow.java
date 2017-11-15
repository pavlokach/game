public class MagicBow implements Hit{
    @Override
    public void kick(Character c1, Character c2) {
        if (c1.getPower() > c2.getPower()) {
            System.out.println("You are too weak");
            c2.setHp(0);
        } else {
            System.out.println(c1.toString() + " decreases power of " + c2.toString() + " by 1");
            c2.setPower(c2.getPower() - 1);
        }
    }
}
