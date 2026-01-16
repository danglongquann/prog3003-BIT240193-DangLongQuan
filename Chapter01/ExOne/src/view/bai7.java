package view;

import java.util.*;

public class bai7 {
    public static void run() {
        System.out.println("=== BAI 7 ===");

        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sach: " + names);
        System.out.println("Nho nhat: " + names.first());
        System.out.println("Lon nhat: " + names.last());
        System.out.println();
    }
}
