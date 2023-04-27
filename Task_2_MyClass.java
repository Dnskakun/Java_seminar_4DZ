import java.util.LinkedList;

public class Task_2_MyClass {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    private int size = 0;

    void enqueue(int item) {
        linkedList.add(item);
        size++;
    }

    int dequeue() {
        size--;
        return linkedList.removeFirst();
    }

    int first() {
        return linkedList.getFirst();
    }

    int size() {
        return size;
    }
}

