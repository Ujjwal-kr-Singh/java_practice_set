import java.util.Scanner;

public class mda {
    static int ms=0;
    public static void main(String[] args) {
        boolean z=true;
        int arr[]=new int [ms];
        Scanner sc=new Scanner(System.in);
        while(z){
        System.out.println("Enter 1 for insertion\nEnter 2 for updation\nEnter 3 for deletion\nEnter 4 to printarray\nEnter 5 to quit");
        System.out.println("Enter your choice>>");
        int c= sc. nextInt();
        switch(c){
            case 1:
            System.out.println("Enter index and element");
            int ind=sc. nextInt();
            int dta=sc. nextInt();
            insert(arr,ind,dta);
            break;
            case 2:
            System.out.println("Enter index and element");
             ind=sc. nextInt();
             dta=sc. nextInt();
            if(ind>ms){
            System.out.println("indexx out of range");
            break;}

            update(arr,ind,dta);
            break;
            case 3:
            if(ms==0){
                System.out.println("ArraY is EmPtY");
                break;
            }
            System.out.println("Enter index to be deleted");
            ind=sc. nextInt();
            if(ind <0&& ind>ms)
            {System.out.println("indexx out of range");
            break;}
                
                System.out.println("deleted ele is"+delete(arr,ind));
                case 4:
                if(ms==0){
                    System.out.println("ArraY is EmPtY");
                    break;
                }
                for(int i=0;i<ms;i++){
                    System.out.print(arr[i]+", ");

                }
                case 5:
                z=false;
        }
    }
    }

    private static int delete(int[] arr, int ind) {
        int x=arr[ind];
        for(int i=ind;i<ms;i++)
        {
            arr[i]=arr[i+1];
        }
        ms--;
        return x;
    }

    private static void update(int[] arr, int ind, int dta) {

    }

    private static void insert(int[] arr, int ind, int dta) {
        ms++;
        arr[ind]= dta;
    }
}
