import java.util.TreeMap;

public class Task_10 {
    public static void main(String[] args) {
//        Дана строка. Необходимо написать метод, который отсортирует слова в
//строке по длине с помощью TreeMap. Строки с одинаковой длиной не
//должны “потеряться”.

//В начале октября владельцы гаджетов Xiaomi из России и Белоруссии начали жаловаться на проблемы в работе устройств

        String s = "В начале октября владельцы гаджетов Xiaomi из России и Белоруссии начали жаловаться на проблемы в работе устройств";
        TreeMap<String, Integer> treeMap = new TreeMap<>((a, b) -> {
            if (a.length() != b.length()) return a.length() - b.length();
            return a.compareTo(b);
        });
        String[] a = s.split(" ");

        for (int i = 0; i < a.length; i++) {
            treeMap.put(a[i], a[i].length());

        }

        treeMap.forEach((a1, b) -> System.out.println(a1 + " = " + b));

    }
}
