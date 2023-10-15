import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int i = 5;
        long l;
        float f;
        double d;
        byte b;
        short s;
        boolean bl;
        char ch = 'u';

        int[] chars = new int[10];
        int[] chars1 = new int[]{10, 100, 1000};
        int[][] chars2 = { {1, 2}, {1, 2, 3, 4, 5, 6} };

        System.out.println(Arrays.toString(chars2));

        for (int j = 0; j < chars2.length; j++) {
            for (int k = 0; k < chars2[0].length; k++) {
                System.out.println(chars2[k][j]+", ");
            }



        }

        chars[2] = 6;

        String s1 = "Hello your are programist";
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase().replace("R", "р"));
    }
}
