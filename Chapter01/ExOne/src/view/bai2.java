package view;

public class bai2 {

    public static <E> void printArray(E[] arr) {
        for (E e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void run() {
        System.out.println("=== BAI 2 ===");

        Integer[] a = {1, 2, 3, 4};
        String[] b = {"A", "B", "C"};

        printArray(a);
        printArray(b);
        System.out.println();
    }
}
