import java.util.*;

public class Seminar3 {

    public static void main(String[] args) {

        Object o = new Object();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3));

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(10));
            list1.add(new Random().nextInt(10));
        }

//        list.add (1);
//        list.add(0, 2);
//        list1.addAll(0, list);
//        Integer i = 1;
//        list.remove(1);
//        list.remove(i);
//        list.contains(i);
//        i = list.get(0);
//        list.set(0, 3);
//        list.indexOf(5);
//        list.lastIndexOf(5);
//        list.subList(0, list.size() / 2).clear();

        System.out.println(list);
        System.out.println(list1);
        System.out.println("-".repeat(16));

//        list.retainAll(list1);
//        System.out.println(list);

//        list.sort(Comparator.naturalOrder());

//        list.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if (o1 % 2 == 0) return 1;
//                if (o2 % 2 == 0) return -1;
//                return 0;
//            }
//        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + ", ");

        }

        for (int i: list) {
            System.out.println(i);

        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
            iterator.remove();
        }

        list.forEach(n -> System.out.println(n));

    }
}
