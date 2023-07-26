package exercise;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        KeyValueStorage storage = new InMemoryKV(Map.of("key", "10"));

        Map<String, String> data = storage.toMap();
        System.out.println(data); // => {key=10};

        KeyValueStorage stor = new InMemoryKV(Map.of("key", "value", "key2", "value2"));
        App.swapKeyValue(stor);

        System.out.println(stor.toMap()); // => {value=key, value2=key2}
    }
}
