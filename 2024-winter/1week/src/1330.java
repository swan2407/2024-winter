import java.util.Scanner;
public class 1330 {
    public static void main(String[] argc){
        Scanner input = new Scanner(System.in);
        long A = input.nextLong();
        long B = input.nextLong();
        if ( A > B){
            System.out.println(">");
        }
        else if ( A < B){
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }
    }
}
