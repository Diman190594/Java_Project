public class TaskTwo {
    public static void main(String[] args) {
//        Написать алгоритм расчёта арифметической прогрессии. От 0 до 10.
        int start = 0;
        int stop = 10;
        int step = 1;
        int sum = 0;
        for (int i = start, j = stop; i < stop ; i += step, j -= step, sum += i);
        System.out.println(sum);
    }
}
