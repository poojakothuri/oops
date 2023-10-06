import java.util.*;


 class roll{
    
        int c,cnt;
         Random r=new Random();
        roll(){
            c=0;
            cnt=0;
          
        }
        void print10(){
        while(c<10){

            int n=r.nextInt(6)+1;
            int n2=r.nextInt(6)+1;
            System.out.println(n+" "+n2);
            if(n==n2) cnt++;
           c++;


        } 
       System.out.println(cnt);
        }
      
    
}
class die{
    public static void main(String args[]){
      
       
        
        roll obj=new roll();
       obj.print10();
       
        
         
    
  
    }
}