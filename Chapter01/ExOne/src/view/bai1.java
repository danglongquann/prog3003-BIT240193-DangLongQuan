package view;

class Test<T> {
    private T value;
    public void set(T t) { value = t; }
    public T get() { return value; }
}

public class bai1 {
    public static void run() {
        System.out.println("=== BAI 1 ===");

        Test<Integer> t1 = new Test<>();
        t1.set(100);

        Test<String> t2 = new Test<>();
        t2.set("Hello Java");

        System.out.println("Integer: " + t1.get());
        System.out.println("String: " + t2.get());
        System.out.println();
    }
}

