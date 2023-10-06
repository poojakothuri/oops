import java.util.*;


 class change{
     
       Vector<Integer> v;
        int c;
         Random r=new Random();
        change(){
            c=0;
            v =new Vector<Integer>();
        }
        void print5(){
        while(c<5){

            int n=r.nextInt(100)+1;
            System.out.println(n);
            if(v.contains(n)) continue;
            else {
                v.add(n);
                c++;
            }


        } 
       System.out.println(v);
        }
      
    
}
class unique5{
    public static void main(String args[]){
      
       
        
        change obj=new change();
       obj.print5();
       
        
         
    
  
    }
}