import java.util.ArrayList;
import java.util.List;

class NaturalNumber {
    Classification classification;
    int  naturalNumber_Sum = 0;

    public Classification getClassification() {
        return classification;
    }

    public NaturalNumber(int naturalNumber) {

        if(naturalNumber <= 0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");

        List<Integer> naturalNumber_dividers = new ArrayList<>();
        for (int i = 1; i < naturalNumber; i++) {
            if (naturalNumber % i == 0) {
                naturalNumber_dividers.add(i);
            }
    }
        for (int i = 0; i < naturalNumber_dividers.size(); i++) {
            naturalNumber_Sum += naturalNumber_dividers.get(i);
        }

        if (naturalNumber_Sum < naturalNumber) {
            classification = Classification.DEFICIENT;
        } else if (naturalNumber_Sum == naturalNumber) {
            classification = Classification.PERFECT;
        } else if (naturalNumber_Sum > naturalNumber) {
            classification = Classification.ABUNDANT;
        }

}
}
