import java.util.Scanner;

public class no2wrd {
 public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n=sc.nextInt();
        String arr[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        ntw(arr,n);
    }
 }
private static void ntw(String[] arr, int n) {
    if (n==0)
    return;   
    ntw(arr,n/10);
    int x=n%10;
    System.out.print(arr[x]+" ");
}   
}