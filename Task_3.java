import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Найдите сумму всех элементов LinkedList, сохраняя
 * все элементы в списке. Используйте итератор.
 */

public class Task_3 {
    public static void main(String[] args) {
        int size_ll = 5;     //количество элементов в LinkedList
        LinkedList<Integer> linkedList = fill_linkedlist(size_ll);
        System.out.println(linkedList);
        System.out.println(find_sum(linkedList));
        
    }
    
    static LinkedList<Integer> fill_linkedlist(int size) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            ll.add((int)(21 * Math.random()));
        }
        return ll;
    }

    static int find_sum(LinkedList<Integer> ll) {
        int sum = 0;
        ListIterator<Integer> listIterator = ll.listIterator();
        while (listIterator.hasNext()) {
            sum += listIterator.next();
        }
        return sum;
    }

}
