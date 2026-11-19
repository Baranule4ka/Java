package Bootcamp_Day3_Module8;
import java.util.ArrayList;
import java.util.List;
public class ListActivity {

    public static void main(String[] args) {
        // Create a list of names
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");

        // Call print method
        print(names);
    }

    static void print(List list) {
        // Print the list
        for (Object name : list) {
            System.out.println(name);
        }
    }
}
