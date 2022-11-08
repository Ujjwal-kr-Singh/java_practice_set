// Online C compiler to run C program online
#include <stdio.h>
#include<string.h>

#define no_item 50

void billing(float [][2],float [],char[],int);
int main() {
  char veg[]={'a','b','g','t','k'};
  float mat[5][2]={40,50,40,10,40,5,40,90,40,80};
  int i,l=sizeof(veg);
  int x=1,sw,noitem=0;
  float arr[no_item];char lst[no_item];
  // struct ctmr* start='NULL';
  printf("\t\tWELLCUM to OOmcar da THEELA\n");
  printf("OOmcar presenting the best THEELA in mumbai///>>>\n");
   while(x){
   printf("press <1>.for grossry list\npress <2>. to enter customerwith  list\npress <3>. for cutsomer bill\npress  <4> To accept bill\npress <5> to exit\n");
  printf("press>>");
  
  scanf("%d",&sw);
  getchar();
  switch(sw){
      
      case 1:
          printf("Grocessary list in stock is ass given below\n");
          printf("|VEGCODE\t|KGs(available)\t|PRICE\n");
          for(i=0;i<l;i++){
            if (mat[i][0]!=0)
              printf("|%c\t\t|  %.1f\t\t|₹%.1f\n",veg[i],mat[i][0],mat[i][1]);
              else
              printf("|%c\t\t| ///out of stock///",veg[i]);
          }   
      break;
  //creating customer 
  case 2:{ char* name[20];
      printf("Enter the name of new customer>>>");
      scanf("%s",&name);
      //printf("%s sabjiii lene aaya\n",name);
      getchar( );
      printf("enter the number of items (from available)\n");
      scanf("%d",&noitem);
      if (noitem>6){
          printf("not enough item>>\n");break;
      }
      printf("please enter veggi code only ass mentioned below\n");
      printf("a>>ALOO  b>> BHINDI g>> GOBHI t>> TAMATAR K>>KANDA\n");
      int j=0;
      for(j=0; j<noitem; j++){
          scanf("%s %f",&lst[j],&arr[j]);
          }
    printf("your  list is>>\n");
      for(j=0;j<noitem;j++){
          printf("%c  %.1fKGs\n",lst[j],arr[j]);
          }
    
      
   break;   
  }
  case 3:{
      printf("your billi>>\n");
      billing(mat,arr,lst,noitem);
      break;
  }
  
  case 4:{
    for(i=0;i<noitem;i++){
            if ((veg[i]==lst[i]))
                mat[i][1]= mat[i][1]-arr[i];
                }
    printf("YOur bill has been processed////    make payements and earn huge discounts(*.~)\n ");
    break;
  }
  case 5:{
    x=0;
    break;
      
  }
    default:
    printf("Enter correct otion only :(");

      
  }  } printf("Thanks for visit(^.^)");
return 0;

}
void billing(float mat[][2] ,float lst[],char arr[], int noitem )
{
    int i=0,j=0;
    for(i=0;i<noitem;i++){ 
      // for(j=0;j<noitem;j++){
        if(arr[i]=='a')
        printf("Alloo\t%.1fKGs\t ₹%.2f\n",lst[j],lst[j]*mat[0][1] );
        else if(arr[i]=='b')
        printf("BHINDI\t%.1fKGs\t ₹%.2f\n",lst[j],lst[j]*mat[1][1] );
        else if(arr[i]=='g')
        printf("GOOBHI\t%.1fKGs\t ₹%.2f\n",lst[j],lst[j]*mat[2][1] );
        else if(arr[i]=='t')
        printf("TAMATAR\t%.1fKGs\t ₹%.2f\n",lst[j],lst[j]*mat[3][1] );
        else if(arr[i]=='k')
        printf("KANDA\t%.1fKGs\t ₹%.2f\n",lst[j],lst[j]*mat[4][1] );
        // }
    }  
    
}
 