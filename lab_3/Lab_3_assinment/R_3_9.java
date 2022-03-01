package Lab_3_assinment;

/**
 ** Created by Ahmed Al masadi on 25/01/2022.
 */
public class R_3_9 {
    public int size_not_as_instance(){
        Node<E>n=head;
        int size=0;
        if (head==null)return size;
        while (n!=null){
            n=n.getNext();
            size++;
        }
        return size;
    }
}
