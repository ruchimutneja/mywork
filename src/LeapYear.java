
public class LeapYear {
    public boolean isLeapYear(int givenYear) {

        if (givenYear % 4 == 0 && (givenYear % 100 != 0 || givenYear % 400 == 0))
            return true;
        else
            return false;

    }
}

