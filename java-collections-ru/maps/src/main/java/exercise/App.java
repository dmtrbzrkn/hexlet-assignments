package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String suggestion) {
        Map<String, Integer> dictionary = new HashMap<>();
        String[] words = suggestion.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = dictionary.get(word);
                if (count == null) {
                    count = 0;
                }
                dictionary.put(word, ++count);
            }
        }
        return dictionary;
    }

    public static String toString(Map<String, Integer> dictionary) {
        if (dictionary.isEmpty()) {
            return "{}";
        }
        var temp = new StringBuilder();
        temp.append("{");
        for (Map.Entry<String, Integer> count : dictionary.entrySet()) {
            temp.append("\n  ").append(count.getKey()).append(": ").append(count.getValue());
        }
        temp.append("\n}");
        return String.valueOf(temp);
    }
}
//END
