package Lab_5_Assignments;

/**
 * Created by Ahmed Al masadi on 9/02/2022.
 */
public class C_3_35 {
    public DoublyLinkedList_Q3<E> clone() throws CloneNotSupportedException {
        // always use inherited Object.clone() to create initial copy
        DoublyLinkedList_Q3<E> other = (DoublyLinkedList_Q3<E>) super.clone(); // safe cast
        if (size > 0) {                       // we need independent node chain
            other.header = new DoublyLinkedList_Q3.Node<>(null, null, null);
            other.trailer = new DoublyLinkedList_Q3.Node<>(null, other.header, null);
            other.header.setNext(other.trailer);
            DoublyLinkedList_Q3.Node<E> walk = header.getNext();   // walk through remainder of original list
            DoublyLinkedList_Q3.Node<E> otherWalk = other.header;
            for(int i = 0; i < size; i++) {           // make new node storing same element
                DoublyLinkedList_Q3.Node<E> newest = new DoublyLinkedList_Q3.Node<>(walk.getElement(), null, null);
                otherWalk.setNext(newest);   // link previous node to this one
                otherWalk = newest;
                otherWalk.setPrev(newest);   // link node back to the previous one
                walk = walk.getNext();
            }
        }
        return other;
    }
}
