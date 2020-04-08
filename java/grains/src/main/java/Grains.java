import java.math.BigInteger;

class Grains {
    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64 ) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger result = BigInteger.ZERO;
        BigInteger firstValue = BigInteger.ONE;
        for (int i = 0; i < square; i++) {
            if (i == 0) {
                result = result.add(firstValue);
            } else {
                result = result.multiply(BigInteger.TWO);
            }
        }
        return result;
    }
    BigInteger grainsOnBoard() {
        BigInteger result = BigInteger.ZERO;
        BigInteger totalResult = BigInteger.ZERO;
        for (int i = 0; i < 64; i++) {
                if (i == 0) {
                result = result.add(BigInteger.ONE);
                totalResult = totalResult.add(result);
            } else {
                result = result.multiply(BigInteger.TWO);
                totalResult = totalResult.add(result);
            }
        }
        return totalResult;
    }
}