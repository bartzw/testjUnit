import java.util.Iterator;
import java.util.TreeMap;
import java.util.Set;
import java.util.*;

public class Bart {

    public static void main(String args[]) {
        // Create a hash map
        TreeMap<String, Double> tm = new TreeMap<>();

        // Put elements to the map
        tm.put("Zara", 3434.34);
        tm.put("Mahnaz", 123.22);
        tm.put("Ayan", 1378.00);
        tm.put("Daisy", 99.22);
        tm.put("Qadir", -19.08);

        // Get a set of the entries
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Get an iterator
        Iterator<Map.Entry<String, Double>> i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry<String, Double> me = i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        double balance = tm.get("Zara");
        tm.put("Zara", balance + 1000);
        System.out.println("Zara's new balance: " + tm.get("Zara"));
    }
}
