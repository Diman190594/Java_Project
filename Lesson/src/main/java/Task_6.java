public class Task_6 {
    public static void main(String[] args) {
//        Заполнить строку и StringBuilder 1000ю символами.
//        Сравнить время заполнения
        String str1 = " ";

        StringBuilder str2 = new StringBuilder("");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            str1 += Character.getName(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        for (int i = 0; i < 50000; i++) {
            str2.append(Character.getName(i));
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
