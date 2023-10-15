public class TaskOne {
        public static void main(String[] args) {
//        Создать строку с текстом. Вывести только чётные символы.

            String string1 = "Привет мир!";
            for (int i = 0; i < string1.length(); i++) {
                if (i % 2 == 0) System.out.print(string1.charAt(i));
            }
        }
    }
