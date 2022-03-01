/**
 ** Created by Ahmed Al masadi on 24/02/2022.
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    E top();
    E pop();
    void  push(E element);

}
