
public class Fizzbuzz {

    private static final int FIVE = 5;
    private static final int THREE = 3;
    public static final String FIZZBUZZ = "fizzbuzz";
    public static final String FIZZ = "fizz";
    public static final String BUZZ = "buzz";

    public String processNumber(String givenNumber) {

        int givenNumberInInteger=Integer.parseInt(givenNumber);

        if(givenNumberInInteger% (FIVE*THREE)==0)
             return FIZZBUZZ;

        if(givenNumberInInteger%THREE==0)
             return FIZZ;

        if(givenNumberInInteger%FIVE==0)
             return BUZZ;

        return givenNumber;
    }
}
