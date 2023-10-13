import java.util.*;
//dog suggestion
class dog{
   String name;
   String breed;
   String color;
   double height;
   String type;
   dog(String n,String b,String c,double h,String t){
     name=n;
     breed=b;
     color=c;
     height=h;
     type=t;
    }
}   







class kennel{
   public static void main(String args[]){ 
   dog snoopy=new dog("snoopy","pomerian","white",1,"guard");
   dog rocky=new dog("rocky","lab","brown",3,"sniffer");
   dog snowy=new dog("snowy","g.sheperd","black",4,"sheperd");
   
    
    while(true){
    
     System.out.println("enter 1 for breed \n enter 2 for color \n enter 3 for height \n enter 4 for type");
     
    System.out.println("enter the number of specification out of 4 or enter -1 to exit ");
    
   Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     switch(n){
      case 1: 
         System.out.println("enter the type of breed ");
         
    
       Lamp obj=new Lamp(s,t);
     }
   } 
   }
