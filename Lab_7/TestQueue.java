package Lab_7;

import java.util.Scanner;

/**
 * Created by Ahmed Al masade on 01/03/2022.
 */
public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue<String> q=new ArrayQueue<>();
        System.out.println("1 insert to queue\t 2 delete from queue");
        int choice=-1;
        Scanner in =new Scanner(System.in);
        while (choice!=0){
            System.out.println("Your choice: ");
            choice=in.nextInt();
            switch (choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("input a name: ");
                    q.enqueue(in.next());
                    break;
                case 2:
                    System.out.println("removed is "+q.dequeue());
                    break;
            }
            System.out.println("First="+q.first()+"\t size"+q.size());
        }
    }

}
