package exercise;

import java.util.Map;


// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> data = storage.toMap();
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String oldKey = entry.getKey();
            String oldValue = entry.getValue();
            storage.unset(oldKey);
            storage.set(oldValue,oldKey);
        }
    }
}
// END
