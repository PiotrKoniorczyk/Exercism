import java.util.Arrays;

class Yacht {

    private int score;

    private int duplicatesFinder(int[] diceFinder){
        int duplicates = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i != j){
                    if (diceFinder[i] == diceFinder[j]){
                        duplicates += 1;} } }}
        return duplicates;
    }
    Yacht(int[] dice, YachtCategory yachtCategory) {

        Arrays.sort(dice);
        int duplicate = duplicatesFinder(dice);

        switch (yachtCategory){
            case ONES:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==1){
                        score += 1; }
                }break;
            case TWOS:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==2){
                        score += 2; }
                }break;
            case THREES:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==3){
                        score += 3; }
                }break;
            case FOURS:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==4){
                        score += 4; }
                }break;
            case FIVES:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==5){
                        score += 5; }
                }break;
            case SIXES:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==6){
                        score += 6; }
                }break;
            case FULL_HOUSE:
                if(duplicate == 8){
                    for (int i = 0; i < 5; i++) {
                        score+=dice[i];
                    }}break;
            case FOUR_OF_A_KIND:
                if (duplicate >= 12){
                    score += dice[2]*4;
                }break;
            case LITTLE_STRAIGHT:
                if (Arrays.equals(dice,new int[]{1,2,3,4,5})){
                    score += 30;
                }break;
            case BIG_STRAIGHT:
                if (Arrays.equals(dice,new int[]{2,3,4,5,6})){
                    score += 30;
                }break;
            case CHOICE:
                for (int i = 0; i < 5; i++) {
                    score+=dice[i];
                }break;
            case YACHT:
                if (duplicate == 20){
                    score += 50;
                }break;
        }
    }
    int score() {
        return score;
    }
}