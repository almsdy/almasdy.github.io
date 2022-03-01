package Lab_3_assinment;

/**
 * Created by Ahmed Al masadi on 25/01/2022.
 * */
public class R_3_6 {
    public E find_second_node( n){
        Node<E> t=n;
        if (t==null||t.getNext()==null)return null;
        while (t.getNext().getNext()!=null)
        {
            t=t.getNext();
        }
        return t.getElement();
    }

}
