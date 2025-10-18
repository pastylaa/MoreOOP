package heroes;

import heroes.parent.Character;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println(c1 + " vs " + c2 + ". Fight!");
        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            int active = (int) Math.random() * 2;
            System.out.println("Round " + round);
            switch (active) {
                case 0:
                    c1.kick(c2);
                    System.out.println(c1 + " uses kick against " + c2 + "!");
                    break;
                default:
                    c2.kick(c1);
                    System.out.println(c2 + " uses kick against " + c1 + "!");
                    break;
            }
            round++;
        }
        if (c1.isAlive() && !c2.isAlive())
            System.out.println("\nWinner: " + c1.getClass().getSimpleName());
        else if (!c1.isAlive() && c2.isAlive())
            System.out.println("\nWinner: " + c2.getClass().getSimpleName());
        else
            System.out.println("\nBoth fell. Draw-ish, but metal.");
    }
}