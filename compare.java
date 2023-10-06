import java.util.*;
class compare{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of inputs");
        n=sc.nextInt();
        while(n>0){
        String s1=sc.next();
        String s2=sc.next();
       int f=s1.compareTo(s2); //returns 0 if equal else any number 
       if(f>0) System.out.println("s1 greater than s2 ");
        else if(f<0) System.out.println("s1 is less than s2");
        else System.out.println("s1 is equal to s2");
        n--;
        }

    

    }
}