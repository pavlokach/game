public class WizardStuff implements Bewitch {
    @Override
    public void castSpell(Mage c1, Character c2) {
        System.out.println(c1.toString() + " hits " + c2.toString() + " and heals himself.");
        c2.setHp(c2.getHp() - c1.getPower());
        c1.setHp(c1.getHp()+ c1.getHeal());

    }
}
