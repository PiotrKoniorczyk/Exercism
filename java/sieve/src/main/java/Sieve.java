import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Sieve {
    private final int PrimeMax;

    Sieve(int maxPrime) {
        PrimeMax = maxPrime;
    }

    List<Integer> getPrimes() {
        return (IntStream.rangeClosed(2, PrimeMax).filter(Sieve::IsPrime).boxed().collect(Collectors.toList()));
    }
    private static boolean IsPrime(int i) {

        return IntStream.rangeClosed(2,(int) Math.sqrt(i)).allMatch(n ->i %n !=0);
    }
}