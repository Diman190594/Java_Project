import java.util.*;

public class Task_11 {
    public static void main(String[] args) {
//        Создать мапу, ключ - случайная строка из Char getName а значение - индекс первой буквы ключа.
//        Вывести пары (ключ/значение) отсортированные по значению.
        HashMap<String,Integer> hashMap = new HashMap<>();
        while (hashMap.size()< 10){
            String a = Character.getName(new Random().nextInt(50));
            hashMap.put(a, (int) a.charAt(0));
        }
        System.out.println(hashMap.toString().replace(",", "\n"));
        System.out.println("-".repeat(15));

//        ArrayList<Integer> list = new ArrayList<>(hashMap.values());
//        list.sort(Comparator.naturalOrder());
//        System.out.println(list);
//        for (int v: list) {
//            for (String k: hashMap.keySet()) {
//                if (hashMap.get(k)==v) System.out.println(k+ "=" +v);;
//            }
//        }
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(5)
                .forEach(k-> System.out.println(k.getKey()+"="+k.getValue()));


    }
}
