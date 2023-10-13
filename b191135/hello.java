import java.util.*;

class Circle{
  float radius;
  Circle(int r){
   radius=r;
   }
   float getArea(){
     return 3.14*r*r;
    }
   float getPerimeter(){
     return 2*3.14*r;
     }
   }







class Area{
   public static void main(String args[]){ 
     for(int i=0;i<3;i++){
        System.out.println("enter the radius ");
        Scanner sc=new Scanner(System.in);
         float r=sc.nextFloat();
      Circle obj=new Circle(r);
       System.out.println(obj.getArea());
       System.out.println(obj.getPerimeter());
     }
   }
