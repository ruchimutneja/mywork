import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrimeFactorTest {

    PrimeFactor primeFactor = new PrimeFactor();

    @Test
        public void should_test_one_is_prime_or_not() throws Exception {
            assertFalse(primeFactor.isPrime(1));
        }

        @Test
        public void should_test_two_is_prime_or_not() throws Exception {
            assertTrue(primeFactor.isPrime(2));
        }

        @Test
        public void should_test_three_is_prime_or_not() throws Exception {
            assertTrue(primeFactor.isPrime(3));
        }

        @Test
        public void should_test_four_is_prime_or_not() throws Exception {
            assertFalse(primeFactor.isPrime(4));
        }

        @Test
        public void should_test_prime_factor_of_two_is_two() throws Exception {
            assertArrayEquals(new Integer[]{}, primeFactor.calculatePrimeFactors(2));
        }

        @Test
        public void should_test_prime_factor_of_four_is_two() throws Exception {
            assertArrayEquals(new Integer[]{3}, primeFactor.calculatePrimeFactors(9));
        }

         @Test
        public void should_test_prime_factor_of_six_is_two_and_three() throws Exception {
            assertArrayEquals(new Integer[]{2,3}, primeFactor.calculatePrimeFactors(6));
        }

}
