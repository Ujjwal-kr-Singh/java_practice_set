public class retpi {
    public static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        int i=0;
        String s="2 + pi * 6 * pi - pi ";
        String c=sting(s,i);
        System.out.println(c);
    }
static String s1="";
    private static String sting(String s,int i) {
        if (i==s.length()){
        String s1="";
        return s1;}
        if(s.charAt(i)=='p' && s.charAt(i+1)== 'i' ){
        s1= s1+"3.14";
        i=i+1;}
        else 
        s1=s1+s.charAt(i);
        sting(s,i+1);
        
        return s1;

         
    }
}
