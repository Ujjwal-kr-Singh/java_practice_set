import java.util.Scanner;


public class rsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
            int n=sc.nextInt(); 
            System.out.println(sirisum(n));
    }

    static int sum=0;
    
    private static int sirisum(int n) {
        if (n==0)
        return sum;
        sum= (sum+n);
        sirisum(n-1);
        return sum;
    }
}