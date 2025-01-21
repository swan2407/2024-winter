import java.util.Scanner;
public class 2588 {
    public static void main(String[] argc){
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = B / 100;
        int D = B / 10 % 10;
        int E = B % 10;
        System.out.println(A*E);
        System.out.println(A*D);
        System.out.println(A*C);
        System.out.println(A*B);
    }
}
