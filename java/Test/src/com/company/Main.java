import java.util.Arrays;
import java.util.Random;

class DnDCharacter {
    private int Strength = rollDice();
    private int Dexterity = rollDice();
    private int Constitution = rollDice();
    private int Intelligence = rollDice();
    private int Wisdom = rollDice();
    private int Charisma = rollDice();
    private int Hitpoints;



    public int ability(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int hitpoints) {
        this.Strength = strength;
        this.Dexterity = dexterity;
        this.Constitution = constitution;
        this.Intelligence = intelligence;
        this.Wisdom = wisdom;
        this.Charisma = charisma;
        this.Hitpoints = hitpoints;

        return ability(Strength,Dexterity,Constitution,Intelligence,Wisdom,Charisma,Hitpoints);
    }

    private int rollDice(){
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
        Hitpoints = ((10 - getConstitution())/2);
        return Hitpoints;
    }


    public int getStrength() {
        return Strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public int getConstitution() {
        return Constitution;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public int getCharisma() {
        return Charisma;
    }

    public int getHitpoints() {
        return Hitpoints;
    }
}
