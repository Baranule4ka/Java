package module10;

import java.util.HashMap;

public class ElectronicItemDetails {

    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        if (itemHashMap.containsKey(name)) {
            return itemHashMap.get(name);
        }
        return 0.0;
    }

    public static void main(String[] args) {
        HashMap<String, Double> itemHashMap = new HashMap<>();
        itemHashMap.put("TV", 450.00);
        itemHashMap.put("Refrigerator", 700.00);
        itemHashMap.put("Washing Machine", 520.00);
        itemHashMap.put("Laptop", 950.00);

        ElectronicItemDetails details = new ElectronicItemDetails();
        System.out.println("Price of TV is " + details.returnPriceOfItem(itemHashMap, "TV"));
        System.out.println("Price of Refrigerator is " + details.returnPriceOfItem(itemHashMap, "Refrigerator"));
        System.out.println("Price of Washing Machine is " + details.returnPriceOfItem(itemHashMap, "Washing Machine"));
        System.out.println("Price of Laptop is " + details.returnPriceOfItem(itemHashMap, "Laptop"));
    }
}