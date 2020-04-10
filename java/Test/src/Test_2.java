import java.util.ArrayList;
import java.util.List;

class Test_2 {

    private int score;

    Test_2(int[] dice, YachtCategory yachtCategory) {


        switch (yachtCategory){
            case ONES:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==1){
                        score += 1;
                    }
                }break;
            case TWOS:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==2){
                        score += 2;
                    }
                }break;
            case THREES:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==3){
                        score += 3;
                    }
                }break;
            case FOURS:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==4){
                        score += 4;
                    }
                }break;
            case FIVES:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==6){
                        score += 6;
                    }
                }break;
            case SIXES:
                for (int i = 0; i < 5; i++) {
                    if (dice[i]==6){
                        score += 6;
                    }
                }break;
        }

    }


    int score() {
        return score;
    }

}