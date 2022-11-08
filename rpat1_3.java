import java.util.Scanner;
public class rpat1_3 {
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
        space(m-n);
        star(2*n-1);
        System.out.println();
    }
    private static void star(int n) {
    if (n==0)
    return;
    System.out.print("*");
    star(n-1);
    }
    private static void space(int n) {
        if (n==0)
    return;
    space(n-1);
    System.out.print(" ");
    }
  
}