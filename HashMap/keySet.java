package HashMap;

import java.util.*;

public class keySet {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();

        // Insert
        h.put("India", 100);
        h.put("China", 150);
        h.put("US", 150);

        // System.out.println(hm);
        
        //Iterate
        Set<String> keys = h.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys: "+k+", value: "+h.get(k));
        }

    }
    
}
