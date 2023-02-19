package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> values;

    public InMemoryKV(Map<String, String> values) {
        this.values = new HashMap<>();
        this.values.putAll(values);
    }

    @Override
    public void set(String key, String value) {
        this.values.put(key, value);
    }

    @Override
    public void unset(String key) {
        this.values.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return this.values.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(this.values);
    }
}
// END
