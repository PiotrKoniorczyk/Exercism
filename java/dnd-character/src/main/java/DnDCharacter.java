import java.util.Arrays;
import java.util.Random;

class DnDCharacter {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;

    public DnDCharacter(){
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
        hitpoints = 10 + modifier(constitution);

    }
    int ability() {
        Random rollDice = new Random();
        int[] result = new int[4];
        int[] range = {1,2,3,4,5,6};
        for (int i = 0; i < 4; i++) {
            int dieceNumber = range[rollDice.nextInt(range.length)];
            result[i] = dieceNumber;
        }
        Arrays.sort(result);

        int abilityValue = 0;
        for (int i = 1; i <= 3; i++) {
            abilityValue += result[i];
        }
        return abilityValue;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return hitpoints;
    }
}
