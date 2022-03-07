package Lab_7;

/**
 * Created by Ahmed Al masade on 01/03/2022.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size();
    void enqueue(E el);
    E dequeue();
    E first();


}
