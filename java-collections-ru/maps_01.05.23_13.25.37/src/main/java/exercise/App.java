package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> result = new HashMap<>();

        if (sentence.length() == 0) {
            return result;
        }

        String[] wordsArray = sentence.split(" ");
        List<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));

        for (String word : wordsList) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }

    public static String toString(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder result = new StringBuilder("{\n");
        for (String entry : map.keySet()) {
            //  the: 2
            result.append("  ").append(entry).append(": ").append(map.get(entry)).append("\n");
        }
        result.append("}");
        return result.toString();
    }
}
//END
