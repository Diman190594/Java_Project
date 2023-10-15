public class Task_4 {
    public static void main(String[] args){
        //Объявить строку с текстом, подсчитать количество запятых.

        String str = "Считаем количество запятых, чтобы посчитать их количество";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ','){
                count++;
            }
        }
        System.out.println(count);
    }
}

