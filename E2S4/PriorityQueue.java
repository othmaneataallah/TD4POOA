import java.util.LinkedList;
import java.util.NoSuchElementException;

public class PriorityQueue<T> implements IPriorityQueue<T> {

    private LinkedList<T> lists[];
    private int totalElements;

    @SuppressWarnings("unchecked")
    public PriorityQueue() {
        lists = new LinkedList[5];
        for (int i = 0; i < 5; i++) {
            lists[i] = new LinkedList<T>();
        }
        totalElements = 0;
    }

    @Override
    public void insert(T element, int priority) throws IllegalArgumentException {
        if (priority < 1 || priority > 5)
            throw new IllegalArgumentException("Priority must be between 1 and 5");

        lists[priority - 1].add(element);
    }

    @Override
    public T remove() throws NoSuchElementException {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");

        T element = null;
        for (int i = 4; i >= 0; i--) {
            if (!lists[i].isEmpty()) {
                element = lists[i].removeLast();
                break;
            }
        }
        totalElements--;
        return element;
    }

    @Override
    public T peek() throws NoSuchElementException {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");

        T element = null;
        for (int i = 4; i >= 0; i--) {
            if (!lists[i].isEmpty()) {
                element = lists[i].getLast();
                break;
            }
        }
        return element;
    }

    @Override
    public boolean isEmpty() {
        return totalElements == 0;
    }

    @Override
    public int size() {
        return totalElements;
    }

}
