public class Sword implements Hit {
    @Override
    public void kick(Character c1, Character c2) {
        System.out.println(c1.toString() + " hits " + c2.toString());
        c2.setHp(c2.getHp() - c1.getPower());
    }
}