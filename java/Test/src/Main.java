import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Proverb {
    public static void main(String[] args) {
        int[] setx = {0};
        int number = 1;
        int sum = 0;
        List<Integer> numlist = new ArrayList<Integer>();
        for (int i = 0; i < setx.length; i++) {
            int num = setx[i];
            int multiplier = 2;
            int add = num;
            while (add < number) {
                boolean checkmulti = false;
                for (int j = 0; j < numlist.size() ; j++) {
                    if(add == numlist.get(j)){
                        checkmulti = true; }
                }
                if(checkmulti == false){numlist.add(add);}
                add = num * multiplier;
                multiplier += 1;

            }
        }
        for (int i = 0; i < numlist.size() ; i++) {
            sum += numlist.get(i);
        }
        System.out.println(numlist);
        System.out.println(sum);
    }
}