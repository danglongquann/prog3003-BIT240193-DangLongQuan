package view;

interface Pair<K, V> {
    K getKey();
    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

public class bai3 {
    public static void run() {
        System.out.println("=== BAI 3 ===");

        Pair<String, Integer> p1 = new OrderedPair<>("MSSV", 240193);
        Pair<String, String> p2 = new OrderedPair<>("HoTen", "dang long quan");

        System.out.println(p1.getKey() + " : " + p1.getValue());
        System.out.println(p2.getKey() + " : " + p2.getValue());
        System.out.println();
    }
}
