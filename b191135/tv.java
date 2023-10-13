import java.util.*;
//tv simulation
class TV{
   int channel;
   int volume;
   boolean on;
   TV(){
   }
   void turnOn(){
    on=true;
    System.out.println("tv is on");
   }
   void turnOff(){
   on=false;
    System.out.println("tv is off");
    }
    void setChannel(int c){
     channel=c;
     } 
   void setVolume(int v){
     volume=v;
     }
    void channelUp(){ 
     if(channel>=40) channel=1;
     else channel++;
       
      System.out.print("channel is ",channel);
      }
      
      void channelDown(){ 
       if(channel<=0) channel=40;
      else channel--;
      System.out.print("channel is ",channel);
      } 
      
      void volumeUp(){ 
       if(volume>=7) System.out.println("maximum volume reached");
    else  volume++;
      System.out.print("volume is ",volume);
      } 
      
      void volumeDown(){ 
       if(volume<=1) System.out.print("minimum volume reached");
    else  volume--;
      System.out.print("volume is ",volume);
      } 
}   







class tv{
   public static void main(String args[]){ 
   System.out.println("enter 1 to turn on tv \n enter 0 to turn off \n 3 to increase channel \n 4 to decrease channel \n 5 to increase volume \n 6 to decrease volume \n 7 to set channel\n 8 to set volume");
   TV t=new TV();
   while(true){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     switch(n){
      case 0: 
         t.turnOff();
         System.exit(0);
         break;
       case 1: 
        t.turnOn();
        break;
       case 3:
         t.channelUp();
         break;
       case 4:
         t.channelDown();
         break;
       case 5 :
         t.volumeUp();
         break;
       case 6:
        t.volumeDown();
         break;
       case 7:
         System.out.println("enter channel number ");
          int c=sc.nextInt();
          t.setChannel(c);
          break;
          
        case 8:
         System.out.println("enter volume number ");
          int v=sc.nextInt();
          t.setVolume(v);
          break;
        
         

}
}
}
}
