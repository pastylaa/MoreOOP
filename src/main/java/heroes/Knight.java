package heroes;

import heroes.parent.Character;

public class Knight extends Character {
    public Knight() {
        super(2 + (int)(Math.random() * 11), 2 + (int)(Math.random() * 11));
    }

    @Override
    public void kick(Character c) {
        int decrease = (int)(Math.random() * this.getPower());
        c.setHp(c.getHp() - decrease);
    }
}