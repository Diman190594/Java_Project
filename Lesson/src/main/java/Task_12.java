import java.util.HashMap;

public class Task_12 {
// Разработать класс, исполняющий функционал класса HashSet без использования сетов вообще. Храним целые числа
// Реализовать метод добавления элемента учитывающий особенности множеств. Сигнатура метода public boolean add(Integer i)
// Реализовать метод удаления элемента учитывающий особенности множеств. Сигнатура метода boolean remove(Object o)
    public static void main(String[] args) {
        Myset mySet = new Myset();
        System.out.println(mySet.add(1));
        System.out.println(mySet.add(1));
        System.out.println(mySet.remove(1));
        System.out.println(mySet.remove(1));
    }

}

class Myset {
    private HashMap<Integer, Object> map = new HashMap<>();

        public boolean add (Integer i) {

        if (map.containsKey(i)) return  false;

        map.put(i, null);
        return true;
    }

    public boolean remove (Object o) {
        if (!map.containsKey(o)) return false;

        map.remove(o);
        return true;
    }

    public void clear() {
        map.clear();
    }
}


