import java.util.*;
class equal{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of inputs");
        n=sc.nextInt();
        while(n>0){
        System.out.println("enter  two strings");
        String s1=sc.next();
        String s2=sc.next();
      
       if(s1.equals(s2)) System.out.println("strings are equal");
        else System.out.println("strings are not equal");

        if(s1.equalsIgnoreCase(s2)) System.out.println("strings contextually are equal");
        else System.out.println("strings  are not equal");
        n--;
        }

    

    }
}