import java.util.stream.Stream;

class LargestSeriesProductCalculator {

    String input;

    LargestSeriesProductCalculator(String inputNumber) {

        if (onlyDig(inputNumber)) {
            input = inputNumber;

        }else {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
    }


    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        final int[] num;
        long result = 0;
        long temp = 0;

        if(input.length() < numberOfDigits )
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");

        if(numberOfDigits<0) throw new IllegalArgumentException("Series length must be non-negative.");

        if(numberOfDigits == 0 || input.equals("")) result = 1;

        else{
            num = Stream.of(input.split("")).mapToInt(Integer::parseInt).toArray();


            for (int i = 0; i + numberOfDigits <= num.length; i++) {
                    result = tempTest(result, temp);
                    temp = num[i];
                    for (int j = 1; j < numberOfDigits; j++) temp *= num[i + j];
                }
            result = tempTest(result, temp);
        }
        return result;
    }

    private long tempTest(long result, long temp) {
        if (temp > result) {
            result = temp;
        }
        return result;
    }

    boolean onlyDig(String input){
        boolean result = true;
        char[] x = input.toCharArray();
        for (int i = 0; i < input.length() ; i++) {
            if (Character.isDigit(x[i])) {
                continue;
            }else {
                result = false;
            }

        }
        return result;
    }


}