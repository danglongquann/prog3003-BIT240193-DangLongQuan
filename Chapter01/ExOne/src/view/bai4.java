package view;

import java.util.*;

public class bai4 {
    public static void run() {
        System.out.println("=== BAI 4 ===");

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        fruits.add(1, "Mango");
        fruits.set(fruits.indexOf("Banana"), "Grapes");

        System.out.println("Danh sach: " + fruits);
        System.out.println("Co Apple khong? " + fruits.contains("Apple"));
        System.out.println();
    }
}
