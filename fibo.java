import java.util.Scanner;

public class fibo{
    public static void main(String[] args) {
           try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();      
            //int f=1;
            System.out.print(n+"th fibonacci digit is>>"+fib(n)+" ");
        }
    }
    private static int fib(int n) {
        
        if (n==1||n==2)
            return 1;
            //int f= n-2 +n-1;       
           return fib(n-1)+fib(n-2);
            
    }
}