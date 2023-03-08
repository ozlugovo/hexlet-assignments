package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String text) {
        List<String> words = List.of(text.split(" "));
        Map<String, Integer> wordsMap = new HashMap<>();

        if (text.length() > 0) {

            for (String j : words) {
                if (wordsMap.containsKey(j)) {
                    wordsMap.put(j, wordsMap.get(j) + 1);
                } else wordsMap.put(j, 1);
            }
        }
        return wordsMap;
    }

    public static String toString(Map<String, Integer> wordsMap) {
        if (wordsMap.size() > 0) {
            String outKeyAndValue = "";
            for (String key : wordsMap.keySet()) {
                Integer value = wordsMap.get(key);
                outKeyAndValue = outKeyAndValue + "\n" + "  " + key + ": " + value;
            }
            String result = "{" + outKeyAndValue + "\n" + "}";
            return result;
        } else {
            return "{}";
        }
    }
}
//END
