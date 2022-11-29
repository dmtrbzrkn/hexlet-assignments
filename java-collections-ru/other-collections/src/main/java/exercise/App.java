package exercise;

import java.util.*;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> firstDictionary, Map<String, Object> secondDictionary)  {
        Set<String> keys = new LinkedHashSet<>();
        keys.addAll(firstDictionary.keySet());
        keys.addAll(secondDictionary.keySet());

        LinkedHashMap<String, String> differences = new LinkedHashMap<>();

        for (var key : keys) {
            if (firstDictionary.containsKey(key) && secondDictionary.containsKey(key)) {
                var firstDictionaryValue = firstDictionary.get(key);
                var secondDictionaryValue = secondDictionary.get(key);
                if (firstDictionaryValue.equals(secondDictionaryValue)) {
                    differences.put(key, "unchanged");
                } else {
                    differences.put(key, "changed");
                }
            } else if (!firstDictionary.containsKey(key) && secondDictionary.containsKey(key)) {
                differences.put(key, "added");
            } else if (firstDictionary.containsKey(key) && !secondDictionary.containsKey(key)) {
                differences.put(key, "deleted");
            }
        }
        return differences;
    }
}
//END
