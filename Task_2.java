/*
 * Реализуйте очередь с помощью LinkedList со следующими
 * методами: enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

public class Task_2 {
    public static void main(String[] args) {
        Task_2_MyClass ll = new Task_2_MyClass();
        ll.enqueue(3);
        ll.enqueue(5);
        ll.enqueue(7);
        ll.enqueue(9);
        System.out.println(ll.toString());
        System.out.println(ll.dequeue());
        System.out.println(ll.first());
        System.out.println("Количество элеементов в списке: " + ll.size());

    }
}
