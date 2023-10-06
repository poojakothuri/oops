import java.util.*;

 class change{
    
     String lowercase(String s){
      
     return s.toLowerCase();
     }
}
class casechange{
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
       
       
        System.out.println( obj.lowercase(s1));
         
    
       
   n--;
        }
  
    }
}