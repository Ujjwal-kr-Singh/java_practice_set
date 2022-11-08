import java.util.Scanner;

public class fact {
    static int facto(int n,int f){
        
        if (n==0)
        return f;
        if(n==1)
        return f;
        
        else
        return facto(n-1,f*n);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int f=1;
            int z=facto(n,f);
            System.out.println("factirial ="+z);
        }
    }
}
