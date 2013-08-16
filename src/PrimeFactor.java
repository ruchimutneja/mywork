import java.util.ArrayList;

public class PrimeFactor {

    public static final int ONE = 1;
    public static final int TWO = 2;

    public Integer[] calculatePrimeFactors(int givenNumber) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 2; i < givenNumber; i++) {
            if (givenNumber % i == 0 && isPrime(i)) {
                result.add(i);
            }
        }
         return result.toArray(new Integer[result.size()]);
    }

    public boolean isPrime(int naturalNumber) {

        if (naturalNumber == ONE)
            return false;
        if (naturalNumber == TWO)
            return true;
        else {
            for (int i = 2; i < naturalNumber; i++) {
                if (naturalNumber % i == 0)
                    return false;
            }
            return true;
        }
    }
}
