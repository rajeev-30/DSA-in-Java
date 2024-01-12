package HashMap;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // //Get
        int p = hm.get("India");
        System.out.println(p);

        // //ContainsKey
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("pak"));//false
        boolean flag = hm.containsValue(50);
        System.out.println(flag);

        // // Remove
        // System.out.println(hm.remove("India"));
        // System.out.println(hm);
        
        // System.out.println(hm.size());
        // hm.clear();
        // System.out.println(hm.isEmpty());

    }
}
