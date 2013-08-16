import java.util.ArrayList;

public class AnagramGenerator {
    String givenString;

    public AnagramGenerator(String givenString) {
        this.givenString=givenString;
    }

    public ArrayList<String> generateAnagram(int startingIndex) {

        ArrayList anagramList = new ArrayList<String>();
        if (startingIndex >= givenString.length() - 1) {
            anagramList.add(givenString);
        } else {
            for (int i = startingIndex; i < givenString.length(); i++) {
                givenString = swapCharacters(startingIndex, i);
                anagramList.addAll(generateAnagram(startingIndex + 1));
                givenString = swapCharacters(i, startingIndex);
            }
        }
        return anagramList;
    }

    public String swapCharacters(int startingIndex, int currentIndex) {
        StringBuilder changedString = new StringBuilder(givenString);
        char temp = changedString.charAt(startingIndex);
        changedString.setCharAt(startingIndex, changedString.charAt(currentIndex));
        changedString.setCharAt(currentIndex, temp);
        return changedString.toString();
    }
}
