package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String lettersSet, String word) {
        boolean isPossible = false;
        List<Character> lettersList = convertToArrayList(lettersSet);
        List<Character> wordList = convertToArrayList(word);
        for (Character character : wordList) {
            isPossible = lettersList.contains(character);
        }
        return isPossible;
    }

    public static List<Character> convertToArrayList(String string) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
        }
        return list;
    }
}
//END
