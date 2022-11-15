public class adjstr {    
    public static void main(String[] args) {
    //Scanner sc= new Scanner(System.in);
    int i=0;
    String s="aabb";
    String ss="xxyy";
    String c=sting(ss,i);
    System.out.println(c);
}
static String s1="";
private static String sting(String s,int i) {
    if (i+1==s.length()){
    String s1="";
    return s1;}
    s1=s1+s.charAt(i);
    if(s.charAt(i)==s.charAt(i+1)){
    s1= s1+"*";
    }
    sting(s,i+1);
    
    return s1+s.charAt(s.length()-1);

     
}
}

    

