import java.util.Scanner;
import java.util.function.BinaryOperator;

public class rd2b {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        long z=d2b(n);
    }
static long bin;
    
    private static long d2b(int n) {
        if (n==0)
        return bin;;
        d2b(n/2);
        if(n%2==0)
        System.out.print("0 ");
        else
        System.out.print("1 ");

        return 0;
        

    }
}
