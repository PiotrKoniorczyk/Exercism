import java.util.ArrayList;
import java.util.List;

class SumOfMultiples {
    int sum = 0;

    SumOfMultiples(int number, int[] set) {
        List<Integer> numlist = new ArrayList<Integer>();
        for (int num : set) {
            if (num == 0) break;
            int multiplier = 2;
            int add = num;
            while (add < number) {
                boolean checkmulti = false;
                for (Integer integer : numlist) {
                    if (add == integer) {
                        checkmulti = true;
                        break;
                    }
                }
                if (!checkmulti) {
                    numlist.add(add);
                }
                add = num * multiplier;
                multiplier += 1;
            }
        }
        for (Integer integer : numlist) {
            sum += integer;
        }
    }
    int getSum() {
        return sum;
    }
}