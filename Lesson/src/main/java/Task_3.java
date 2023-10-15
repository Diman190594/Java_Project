import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
//        Выкинуть случайное число, сохранить в переменную. Целое число от 0 до 1000.
//        Найти старший значащий бит выпавшего числа!)
//        Решить используя высокоуровневые инструменты.

        int num = new Random().nextInt(0,1001);
        System.out.println(num);
        System.out.println(Integer.toBinaryString(num).length());
        var v = 0;
        while (num != 0) {
            num = num / 2;
            v++;
        }
        System.out.println(v);
    }
}
