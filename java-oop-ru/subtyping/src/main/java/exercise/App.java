package exercise;

import java.util.Map;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage keyValueStorage) {
        Map<String, String> map = keyValueStorage.toMap();
        for (Map.Entry<String, String> stringEntry : map.entrySet()) {
            var oldKey = stringEntry.getKey();
            var oldValue = stringEntry.getValue();

            keyValueStorage.set(oldValue, oldKey);
            keyValueStorage.unset(oldKey);
        }
    }
}
// END
