package heroes;

import heroes.parent.Character;

public class CharacterFactory {
    public Character createCharacter() {
        int i = (int) Math.random() * 4;
        switch (i) {
            case 0: return new Hobbit();
            case 1: return new Elf();
            case 2: return new King();
            default: return new Knight();
        }
    }
}