class DifferenceOfSquaresCalculator {
    
    int computeSquareOfSumTo(int input) {
        int squareOfSum = 0;
        for (int i = 1; i <= input ; i++) {
            squareOfSum += i;
        }
        squareOfSum = (int) Math.pow(squareOfSum,2);
        return squareOfSum;
    }
    int computeSumOfSquaresTo(int input) {
        int sumOfSquares = 0;
        for (int i = 1; i <= input; i++) {
            sumOfSquares += Math.pow(i,2);
        }
        return sumOfSquares;
    }
    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}