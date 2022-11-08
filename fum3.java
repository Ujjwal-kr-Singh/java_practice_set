public class fum3 {
    public static void main(String[] args) {
        int a[]={1,2,6,0,3,8};
        int max=-1;
        for(int i=0;i<6;i++){
            if(a[i]>max)
            max=a[i];  
        }
        int b[]={8,8,8,8,8,8};
        for(int i=0;i<max;i++){
        for(int j=0;j<6;j++){
            if(a[j]>=b[j]){
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        b[j]--;
        }        

    System.out.println();
    }
    }
}
