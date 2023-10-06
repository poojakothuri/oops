import java.util.*;
class indexof{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of inputs");
        n=sc.nextInt();
        while(n>0){
        System.out.println("enter  a string");
        String s1=sc.next();
          System.out.println("enter  a character");
          char c=sc.next().charAt(0);
       

            int cnt=0;
     
       for(int i=0;i<s1.length();i++) {
         if(s1.charAt(i)==c) cnt++;
       } 
        System.out.println(cnt);
    
       
   n--;
        }
  
    }
}