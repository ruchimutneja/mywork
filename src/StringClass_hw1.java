
public class StringClass_hw1 {

    public static final double THIRTY_PERCENT = 0.3;
    public static final String MOMMY = "mommy";

    public String proceeString(String givenString)
    {

        if(calculatePercentaegOfVowels(givenString))
        {
            return getMommifiedString(givenString);
        }
        else
            return givenString;
    }

    private String getMommifiedString(String givenString) {
        String result = "";
        for(int i=0;i<givenString.length();i++)
        {
            if(isVowel(givenString.charAt(i)))
            {
                i = getContinuousVowels(givenString, i);
            }
            if(isVowel(givenString.charAt(i)))
                result+= MOMMY;
            else
                result+=givenString.charAt(i);
        }
        return result;
    }

    private int getContinuousVowels(String givenString, int i) {

        while(isVowel(givenString.charAt(i)) && i<givenString.length())
        { i++;
        }
        return --i;
    }

    private boolean isVowel(char stringCharacter)
    {
        if(stringCharacter=='a' ||stringCharacter=='e'||stringCharacter=='i'||stringCharacter=='o'||stringCharacter=='u')
            return true;
        else
            return false;
    }


    public boolean calculatePercentaegOfVowels(String givenSting) {
        int count=0;
        for(int i=0;i<givenSting.length();i++)
        {
            if(isVowel(givenSting.charAt(i)))
                count++;
        }
        if(count>givenSting.length()* THIRTY_PERCENT)
            return true;
        else
            return false;

    }
}
