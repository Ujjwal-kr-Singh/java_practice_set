//this progarm is to calculate the no. ways to climb stairs taking atmost 2-steps at a time. 

import java.util.Scanner;

public class steps {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(calstpes(n)); 
    }
static int c =1;
    private static int calstpes(int n) {
        if(n<=1)
        return c;
        c=c +1;
        calstpes(n-1);
        calstpes(n-2);
    return c;
    }
}
