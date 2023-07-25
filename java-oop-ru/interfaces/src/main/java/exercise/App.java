package exercise;

import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App  {
    public static List<String> buildApartmentsList(List<Home> apartments, int n) {
        List<Home> aparmentsArea = new ArrayList<>(apartments);
        aparmentsArea.sort(Home::compareTo);
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String value = aparmentsArea.get(i).toString();
            result.add(value);
        }
        return result;
    }
}
// END
