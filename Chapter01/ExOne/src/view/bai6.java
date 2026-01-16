package view;

import java.util.*;

public class bai6 {
    public static void run() {
        System.out.println("=== BAI 6 ===");

        int[] arr = {5, 2, 9, 2, 5, 8, 1};
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        System.out.println("Cac phan tu duy nhat: " + set);
        // HashSet khong giu thu tu ban dau
        System.out.println();
    }
}
