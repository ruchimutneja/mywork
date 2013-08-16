import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AnagramGeneratorTest {

    @Test
    public void should_give_a_for_a()
    {
        ArrayList output = new AnagramGenerator("a").generateAnagram(0);
        assertArrayEquals(new String[]{"a"}, (String[]) output.toArray(new String[output.size()]));
    }

    @Test
    public void should_generate_ab_and_ba_for_ab()
    {
        ArrayList output = new AnagramGenerator("ab").generateAnagram(0);
        assertArrayEquals(new String[]{"ab","ba"}, (String[])output.toArray(new String[output.size()]));
    }

    @Test
    public void anagramOfabcIsSixStringsOfItsAnagram()
    {
        ArrayList output = new AnagramGenerator("abc").generateAnagram(0);
        assertArrayEquals(new String[]{"abc","acb","bac","bca","cba","cab"}, (String[])output.toArray(new String[output.size()]));
    }



}
