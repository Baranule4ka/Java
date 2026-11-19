package Bootcamp_Day3_Module8;
import java.util.HashSet;
import java.util.Set;
public class SetActivity {
    public static void main(String[] args) {
        //Create a set of names using HashSet
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");
        names.add("Harry");
        names.add("Daniel");

        //Call print method
        print(names);
    }
    static void print(Set set) {
        //  Print the set
        for (Object name : set) {
            System.out.println(name);
        }
    }
}