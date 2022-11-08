
import java.util.Scanner;

public class rpat3 {
       public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            pat(n,n);
        }
    }
       private static void pat(int n,int m) {
        if (n==0)
        return;
        pat(n-1,m);
       
       for(int j=m-n;j>=0;j--){
           System.out.print(" ");
           }
           for(int k=0;k<n*2-1;k++)
           System.out.print("*");
           System.out.println();

    }
}
