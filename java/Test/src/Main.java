import java.util.ArrayList;
import java.util.List;

class NaturalNumber {

    List<Integer> naturalNumber_dividers = new ArrayList<>();
        for (int i = 1; i < NaturalNumber; i++) {
        if (NaturalNumber % i == 0) {
            naturalNumber_dividers.add(i);
        }
    }
    int naturalNumber_Sum = 0;
        for (int i = 0; i < naturalNumber_dividers.size(); i++) {
        naturalNumber_Sum += naturalNumber_dividers.get(i);


    }
        if (naturalNumber_Sum < NaturalNumber) {
        return Classification.DEFICIENT;
    } else if (naturalNumber_Sum == NaturalNumber) {
        return Classification.PERFECT;
    } else if (naturalNumber_Sum > NaturalNumber) {
        return Classification.ABUNDANT;
    }

        return null;
}
}
