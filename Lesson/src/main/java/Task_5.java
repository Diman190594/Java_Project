public class Task_5 {
    public static void main(String[] args) {
        //    Задать две строки. Найти все вхождения первой строки во вторую.
        //    Вывести в консоль количество и индексы начала

        String str1 = "а";
        String str2 = "Вторая строка Первая строка";
        int index = str2.indexOf(str1, str2.length() / 2);
//        System.out.println(index);

        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            if ((str2.indexOf(str1, str2.indexOf(str1) + 1)) >= 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
