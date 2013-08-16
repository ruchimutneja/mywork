import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringClass_hw1_Test {
        
    StringClass_hw1 stringClass_hw1=new StringClass_hw1();
    
    @Test
    public void should_give_same_string_if_no_vowel_present() throws Exception {
       assertEquals("sh", stringClass_hw1.proceeString("sh"));
    }

    @Test
    public void should_check_percentage_of_vowels_in_the_String_is_30_or_not() throws Exception {
        assertEquals(true,stringClass_hw1.calculatePercentaegOfVowels("his"));
    }

    @Test
    public void should_not_change_string_if_vowel_precentage_is_less_than_30_of_the_string() throws Exception {
        assertEquals("hisss",stringClass_hw1.proceeString("hisss"));

    }

    @Test
    public void should_insert_MOMMY_if_vowel_percentage_is_more_than_30_of_the_string() throws Exception {
        assertEquals("hmommys",stringClass_hw1.proceeString("his"));
    }

    @Test
    public void should_insert_MOMMY_once_if_continuous_vowels_are_there() throws Exception {
        assertEquals("hmommyr",stringClass_hw1.proceeString("hear"));

    }
}
