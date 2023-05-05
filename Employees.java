import java.util.HashMap;
import java.util.Map;

public class Employees {
    private Map<String, Integer> map = new HashMap<>();

    void add(String Name, String lastName){
        map.put(Name, Integer.valueOf(lastName));
    }
    String getByName(String Name) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet())
            if (entry.getValue().equals(Name)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append((": "));
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");
            }

        return stringBuilder.toString();
    }
}