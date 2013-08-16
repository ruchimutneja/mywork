import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class fizzbuzzTest {
        Fizzbuzz fizzbuzz=new Fizzbuzz();

    @Test
    public void should_give_one_for_one() throws Exception {
      assertEquals("1", fizzbuzz.processNumber("1"));
    }

    @Test
    public void should_give_two_for_two() throws Exception {
      assertEquals("2",fizzbuzz.processNumber("2"));
    }

    @Test
    public void should_give_fizz_for_three() throws Exception {
      assertEquals("fizz",fizzbuzz.processNumber("3"));
    }

    @Test
    public void should_give_four_for_four() throws Exception {
        assertEquals("4",fizzbuzz.processNumber("4"));
    }

    @Test
    public void should_give_buzz_for_five() throws Exception {
        assertEquals("buzz",fizzbuzz.processNumber("5"));
    }

    @Test
    public void should_give_fizz_for_every_multiple_of_three() throws Exception {
        assertEquals("fizz", fizzbuzz.processNumber("9"));
    }

    @Test
    public void should_give_buzz_for_every_multiple_of_five() throws Exception {
         assertEquals("buzz",fizzbuzz.processNumber("10"));

    }

    @Test
    public void should_give_fizzbuzz_for_multiple_of_both_three_and_five() throws Exception {
        assertEquals("fizzbuzz",fizzbuzz.processNumber("15"));
    }

    @Test
    public void should_give_fizzbuzz_for_multiple_of_fifteen() throws Exception {
        assertEquals("fizzbuzz",fizzbuzz.processNumber("90"));

    }
}
