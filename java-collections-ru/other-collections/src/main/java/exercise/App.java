package exercise;

import java.util.*;

// BEGIN
public class App {

    public static LinkedHashMap<String, String> genDiff(Map<String, Object> oneMap, Map<String, Object> twoMap) {
// Надо создать два списка сет в который занесем ключи из первого и ключи из второго
// найти пересечения ключей.
// сравнить значения ключей и добавить в возвращаемую таблицу с changed или unchanged
// затем удалить пересечения в обоих списках и перенести от туда значения с added и deleted.
        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        Set<String> setOneMap = new HashSet<>(oneMap.keySet());
        Set<String> setTwoMap = new HashSet<>(twoMap.keySet());

        Set<String> intersection = new HashSet<>(setOneMap);
        intersection.retainAll(setTwoMap);
        for(String key: intersection) {
            if (oneMap.get(key).equals(twoMap.get(key))) {
                result.put(key, "unchanged");
            } else {
                result.put(key, "changed");
            }
        }
        setOneMap.removeAll(intersection);
        setTwoMap.removeAll(intersection);
        for (String key: setOneMap) {
            result.put(key, "deleted");
        }
        for (String key: setTwoMap) {
            result.put(key, "added");
        }
        return result;
    }
}
//END
