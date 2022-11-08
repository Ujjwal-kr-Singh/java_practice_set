import java.util.Scanner;

public class rpat1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            pat(n);
        }
    }

    private static void pat(int n) {
        if (n == 0)
            return;
        int i = 0; 
        while (i != n) {
            System.out.print("*");
            i++;
        }
        System.out.println();
     pat(n - 1);
     i=0;
     while (i != n) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
}
