class GameManager {
    void fight(Character c1, Character c2) {
        System.out.println(c1.toString());
        System.out.println("VS");
        System.out.println(c2.toString());

        if (c1.getClass().toString().substring(6).equals(c2.getClass().toString().substring(6)))
            System.out.println("Bros don't fight");
        else {
            while (true) {
                c1.kick(c2);
                if (!(c2.isAlive())) {
                    System.out.println(c1.toString() + " is the winner!!!");
                    break;
                }
                c2.kick(c1);
                if (!(c1.isAlive())) {
                    System.out.println(c2.toString() + " is the winner");
                    break;
                }
            }
        }
    }
}
