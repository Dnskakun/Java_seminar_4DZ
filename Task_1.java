/*
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый”
 * список. Постараться не обращаться к листу по индексам.
 */

import java.util.LinkedList;
import java.util.ListIterator;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("будильник");
        linkedList.add("зазвонил");
        linkedList.add("рано");
        linkedList.add("утром");
        System.out.println(linkedList.toString());
        System.out.println(revers_linked_list(linkedList).toString());
    }
    
    static LinkedList<String> revers_linked_list(LinkedList<String> ll) {
        LinkedList<String> revers_ll = new LinkedList<>();
        ListIterator<String> listIterator = ll.listIterator(ll.size());
        while (listIterator.hasPrevious()){
            revers_ll.add(listIterator.previous());
        }
        return revers_ll;
    }
}