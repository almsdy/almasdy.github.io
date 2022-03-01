import java.util.Scanner;

/**
 * Created by Ahmed Al masadi on 24/02/2022.
 */
public class TestStack {
    public static void main(String[] args) {
        ArrayStack<String> stack= new ArrayStack<>(5);
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.print("input name:");
            stack.push(in.next());
            System.out.println("top: "+stack.top()+"\t size= "+stack.size());


        }
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop()+"\t");
        }
    }
}
