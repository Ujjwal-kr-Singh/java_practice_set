import java.util.Scanner;

public class recpow {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the number then its power");
            float n=sc.nextFloat();
            int m=sc.nextInt();
            System.out.println (pfn(n,m));
        }
    }

    private static double pfn(float n, int m) {
        if (m==0)
        return 0;
        pfn(n,m-1);
        double x= Math.pow(n, m);
        return   x;
      }
}
