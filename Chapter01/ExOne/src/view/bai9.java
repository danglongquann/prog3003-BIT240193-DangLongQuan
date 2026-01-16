package view;

import java.util.*;

public class bai9 {
    public static void run() {
        System.out.println("=== BAI 9 ===");

        TreeMap<String, Double> products = new TreeMap<>();
        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);

        SortedMap<String, Double> sub = products.subMap("K", "N");

        System.out.println("Danh sach san pham: " + products);
        System.out.println("Tu K den M: " + sub);
        System.out.println();
    }
}
