import java.util.*;
class concat{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of inputs");
        n=sc.nextInt();
        while(n>0){
        System.out.println("enter  two strings");
        String s1=sc.next();
        String s2=sc.next();
       s1=s1.concat(s2);
      System.out.println(s1);
        
        n--;
        }

    

    }
}