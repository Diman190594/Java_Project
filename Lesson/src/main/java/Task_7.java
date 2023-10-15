import java.util.ArrayList;
import java.util.Random;

public class Task_7 {
    public static void main(String[] args) {
//        Создать два целочисленных списка. Первый заполнить случайным числом, второй заполнить
//        чётными элементами первого.

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
        }
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        list2.removeIf(n -> n % 2 == 1);
        System.out.println(list2);
    }
}
