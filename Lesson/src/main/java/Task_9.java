import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Task_9 {
    public static void main(String[] args) {
//        Создать два списка, Один инт второй стринг.
//        Заполнить первый случайным числом. Второй строковыми значениями первого.
//        Создать цельночисленный список, найти средний по значению элемент.

        ArrayList<Integer> list1 = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(100));
        }
        System.out.println(list1);
//        ArrayList<Integer> list2 = new ArrayList<>(list1);
//        list2.sort(Comparator.naturalOrder());
//        System.out.println(list2);
//
//        int i =  list2.get(list2.size() / 2);
//        System.out.println(list1.indexOf(i));

        int sum = 0;

        for (int i = 0; i < list1.size(); i++) {
            sum += list1.get(i);
        }

        int[] n = {sum / list1.size()};
        System.out.println(Arrays.toString(n));
        list1.sort(Comparator.comparingInt(o -> Math.abs(o - n[0])));
        System.out.println(list1);

    }
}
