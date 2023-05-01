package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();

        for (Map<String, String> book : books) {
            boolean isFind = true;

            for (Entry<String, String> entry : where.entrySet()) {
                String value = book.getOrDefault(entry.getKey(), "");
                if (!value.equals(entry.getValue())) {
                    isFind = false;
                }
            }

            if (isFind) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
