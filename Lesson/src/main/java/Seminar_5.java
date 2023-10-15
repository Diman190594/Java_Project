import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Seminar_5 {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(5, "Пять");
        hashMap.putIfAbsent(5, "Пять");
        hashMap.replace(5, "Пять");
        hashMap.put(5, "Три");
        hashMap.replace(5, "Три", "Пять");
        String str = hashMap.get(5);
        hashMap.getOrDefault(5, "Ничего");
        if (hashMap.containsValue("Пять")) {
        }
        if (hashMap.containsKey(5)) {
        }
        hashMap.remove(5);
        hashMap.remove(5, "Три");

        for (int i = 0; i < 10; i++) {
            hashMap.put(i, Character.getName(i));
        }

        hashMap.compute(10, (k, v) -> v == null ? v = "10" : v + "11");
        hashMap.computeIfPresent(10, (k, v) -> v == null ? v = "10" : v + "11");
        hashMap.computeIfAbsent(10, v -> "9");

        Set<Map.Entry<Integer, String>> a = hashMap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = a.iterator();
        while (iterator.hasNext()) {
        }

        Set<Integer> k = hashMap.keySet();
        Collection<String> v = hashMap.values();

        AtomicInteger integer = new AtomicInteger(11);
        hashMap.merge(integer.get(), "11", (o, n) -> {
            if (o == null) {
                System.out.println("Оштибка");
                System.exit(-1);
            }
            o = o + n + String.valueOf(integer.get());
            return o;
        });

        System.out.println(hashMap);

        hashMap.forEach((k1, v1) -> System.out.println(k + " = " + v));

    }
}