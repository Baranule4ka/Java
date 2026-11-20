package Bootcamp_Day3_Module8;
import java.util.HashMap;
import java.util.Map;
public class MapActivity {
    public static void main(String[] args) {
        // Create a HashMap where key is an id (String) and value is a name
        Map<String, String> users = new HashMap<>();
        users.put("101", "John");
        users.put("102", "Harry");
        users.put("103", "Daniel");

        //Create an instance (print is non-static) and call print
        MapActivity obj = new MapActivity();
        obj.print(users);
    }
    void print(Map map) {
        // Print all keys and values
        for (Object key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
