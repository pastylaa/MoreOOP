package heroes;

import heroes.parent.Character;

public class King extends Character {
    public King() {
        super(5 + (int)(Math.random() * 11), 5 + (int)(Math.random() * 11));
    }

    @Override
    public void kick(Character c) {
        int decrease = (int)(Math.random() * this.getPower());
        c.setHp(c.getHp() - decrease);
    }
}