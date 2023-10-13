import java.util.*;

class Lamp{
   boolean isOn;
   String lampType;
   Lamp(String status,String type){ 
    if(status.equals("on")) isOn=true;
    if(status.equals("off")) isOn=false;
    lampType=type;
    
     if(isOn == true)
      turnOn();
     else if(isOn == false)
      turnOff();
    
   } 
   void turnOn(){
    System.out.println(lampType +" is glowing");
    }
    void turnOff(){
    System.out.println(lampType +" is not glowing");
    }
}   







class OnOff{
   public static void main(String args[]){ 
    System.out.println("enter your input or enter exit to exit ");
    
    while(true){
   
     System.out.print("enter the type of bulb ");
      Scanner sc=new Scanner(System.in);
     String t=sc.next();
      if(t.equals("exit")) break;
     System.out.print("enter status of the bulb");
      String s=sc.next();
      if(s.equals("exit")) break;
    
       Lamp obj=new Lamp(s,t);
     }
   } 
   }
