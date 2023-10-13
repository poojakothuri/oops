//area  perimeter
 
 import java.util.*;
 
 class shape{
    int getArea(int x){
       return x*x;
       }
      int getPerimeter(int x){
       return 4*x;
       }
       
     double getArea(double x){
       return (3.14)*x*x;
       }
      double getPerimeter(double x){
       return 2*(3.14)*x;
       }
       
       double getArea(double x,double y){
       return x*y;
       }
      double getPerimeter(double x,double y){
       return 2*(x+y);
       }
 
 }
 
 
 
 
 class Area{
   public static void main(String args[]){
     shape square=new shape();
      System.out.println("square");
     System.out.println("area : "+square.getArea(4));
     System.out.println("perimeter: "+square.getPerimeter(4));
     shape rect=new shape();
     System.out.println("rectangle");
     System.out.println("area : "+square.getArea(3,5.2));
     System.out.println("perimeter: "+square.getPerimeter(3,5.2));
      shape circle=new shape();
      System.out.println("circle");
     System.out.println("area : "+square.getArea(7.0));
     System.out.println("perimeter: "+square.getPerimeter(7.0));
     
 }}
