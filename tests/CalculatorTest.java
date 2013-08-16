import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void should_give_forty_five_for_forty_five_comma_plus_is_forty_five() {
        assertEquals(45, calculator.returnResults("45,+"));
    }

    @Test
    public void should_sixty_five_for_sixty_five_comma_plus_is_sixty_five() {
        assertEquals(65, calculator.returnResults("65,*"));
    }

    @Test
    public void should_evaluate_the_expression_correctly() {
        assertEquals(110, calculator.returnResults("50,60,+"));
    }

    @Test
    public void should_add_the_digits_present_in_the_expression() {
        assertEquals(135, calculator.returnResults("45,89,1,+"));
    }

    @Test
    public void should_multiply_the_digits_present_in_the_expression() throws Exception {
        assertEquals(72, calculator.returnResults("3-4-6-*"));

    }
}


