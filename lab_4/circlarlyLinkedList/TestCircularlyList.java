import java.util.Scanner;

/**
 ** Created by Ahmed Al masadi on 2/02/2022.
 */
public class TestCircularlyList {
    public static void main(String[] args) {
        CiruculyLinkedList<String>list= new CiruculyLinkedList<>();
        Scanner in = new Scanner(System.in);
        int choice=-1;
        System.out.println(" 1 add first\n" +
                "2 add last\n" +
                "3 remove first\n" +
                "4 rotate\n" +
                "0 exit");
        while (choice!=0)
        {
            System.out.print("your choice: ");
            choice=in.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("input name");
                    list.addFirst(in.next());
                    System.out.println("first= "+list.first()+
                    "\tlast= "+list.last()+"\tsize= "+list.size());
                    break;
                case 2:
                    System.out.print("input name");
                    list.addLast(in.next());
                    System.out.println("first= "+list.first()+
                            "\tlast= "+list.last()+"\tsize= "+list.size());
                    break;
                case 3:
                    System.out.println("deleted name= "+list.removeFirst());
                    System.out.println("first= "+list.first()+
                            "\tlast= "+list.last()+"\tsize= "+list.size());
                    break;
                case 4:
                    list.rotate();
                    System.out.println("first= "+list.first()+
                            "\tlast= "+list.last()+"\tsize= "+list.size());
                    break;
                case 0:
                    System.exit(0);
            }

        }
    }
}
