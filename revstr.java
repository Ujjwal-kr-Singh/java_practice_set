import java.util.Scanner;
public class revstr {
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        String str=sc.next();
        int l=str.length();
        strev(l,str);
    }
}
static int i=0;
static void strev(int l,String str) {
    String rts="";
    if(i==l)
    return ;
    rts=rts+str.charAt(i);
    i=i+1;
    strev(l,str);
    System.out.print(rts);
}



}
