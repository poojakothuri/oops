import java.util.*;

class Circle{
  float radius;
  Circle(float r){
   radius=r;
   }
   double getArea(){
     return 3.14*radius*radius;
    }
   double getPerimeter(){
     return 2*3.14*radius;
     }
   }







class Area{
   public static void main(String args[]){ 
     for(int i=0;i<3;i++){
        System.out.println("enter the radius ");
        Scanner sc=new Scanner(System.in);
         float r=sc.nextFloat();
      Circle obj=new Circle(r);
       System.out.print("area of circle is ");
       System.out.println(obj.getArea());
       System.out.print("perimeter of circle is ");
       System.out.println(obj.getPerimeter());
     }
   } 
   }
