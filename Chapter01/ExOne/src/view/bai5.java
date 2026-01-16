package view;

import java.util.*;

public class bai5 {
    public static void run() {
        System.out.println("=== BAI 5 ===");

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        list.removeFirst();
        list.removeLast();

        System.out.println("Danh sach con lai: " + list);
        System.out.println();
    }
}
