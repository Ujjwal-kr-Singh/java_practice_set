import java.util.Scanner;

public class revno {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            System.out.println(rfn(n));
        }        
    }
static int c,r;
    private static int rfn(int n) {
        if (n==0)
        return 0;
        c=c+1;
        r=r*10 +n%10;
        rfn(n/10);
        //System.out.println(c);
        return r;
        
    }
}
