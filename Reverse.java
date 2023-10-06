import java.util.*;

 class change{
    
     String rev(String s){
      
      String n="";
      for(int i=s.length()-1;i>=0;i--){
        n=n+s.charAt(i);
      }
      return n;
     }
}
class Reverse{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of inputs");
        n=sc.nextInt();
        while(n>0){
        System.out.println("enter  a string");
        String s1=sc.next();
          System.out.println(s1);
        change obj=new change();
       
       
        System.out.println( obj.rev(s1));
         
    
       
   n--;
        }
  
    }
}