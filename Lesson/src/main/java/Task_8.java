import java.util.ArrayList;
import java.util.Random;

public class Task_8 {
    public static void main(String[] args) {

//        Создать два списка, Один инт второй стринг.
//        Заполнить первый случайным числом. Второй строковыми значениями первого.

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
//            list2.add(String.valueOf(list1.get(i)));

        }

        list1.forEach(n -> list2.add(0, String.valueOf(n)));
        System.out.println(list1);
        System.out.println(list2);
    }
}
