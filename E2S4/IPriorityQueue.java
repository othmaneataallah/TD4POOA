import java.util.NoSuchElementException;

public interface IPriorityQueue<T> {
    void insert(T element, int priority) throws IllegalArgumentException;

    T remove() throws NoSuchElementException;

    T peek() throws NoSuchElementException;

    boolean isEmpty();

    int size();
}
