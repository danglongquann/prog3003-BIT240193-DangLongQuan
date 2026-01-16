package view;

import java.util.*;

public class bai8 {
    public static void run() {
        System.out.println("=== BAI 8 ===");

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Anna");
        map.put(102, "Peter");
        map.put(103, "Mary");

        System.out.println("Nhan vien 102: " + map.get(102));

        if (!map.containsKey(105)) {
            map.put(105, "Unknown");
        }

        System.out.println("Danh sach nhan vien: " + map);
        System.out.println();
    }
}
