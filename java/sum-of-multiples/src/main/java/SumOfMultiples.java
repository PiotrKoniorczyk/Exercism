import java.util.ArrayList;
import java.util.List;

class SumOfMultiples {
    int sum = 0;

    SumOfMultiples(int number, int[] set) {
        List<Integer> numlist = new ArrayList<Integer>();
        for (int i = 0; i < set.length; i++) {
            int num = set[i];
            if(num == 0)break;
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
    }


    int getSum() {
        return sum;
    }

}
