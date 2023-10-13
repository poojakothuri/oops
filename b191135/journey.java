import java.util.*;
//journey
class car{
   String company;
   double mileage;
   double speed;
   String color;
   car(String n,double b,double s,String c){
     company=n;
     mileage=b;
     speed=s;
    color=c;
    }
}   







class journey{
   public static void main(String args[]){ 
    car c[]=new car[3];
  
     c[0]=new car("ford",50,60,"blue");
      c[1]=new car("Toyota",40,50,"white");
       c[2]=new car("volkswagan",50,40,"black");
      
      //mileage=distance/fuel consumption
      //fuel consumption=distance/mileage;
      System.out.println("enter the distance ");
      Scanner sc=new Scanner(System.in);
      double dist=sc.nextDouble(); 
      double f=0,t=0,mini=99999999;
      String n="";
      for(int i=0;i<3;i++){
         f=dist/c[i].mileage;
          if(mini>f){
            mini=f;
            n=c[i].company;
            t=dist/c[i].speed;
            }
         else if(mini==f){
           if((dist/c[i].speed)<t){
             n=c[i].company;
            t=dist/c[i].speed;
            }
            } 
            
          
       }
        System.out.println(n);
        
        }
   }
   
    
  
