
import java.util.Scanner;

public class fum5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n= sc.nextInt();
            int a[]=new int[n];
            //int zeros=0,ones=0;

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
                       
            int i=0,j=n-1;
            while(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }                                                                                               

            for( i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        }

    }
}
