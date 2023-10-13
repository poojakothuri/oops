import java.util.*;

/* toString() method is used to get the string representation of an object. 
whenever we try to print the object reference then internally toString() method is invoked. If we did not define the toString() method in your class then the Object class toString() method is invoked otherwise our implemented or overridden toString() method will be called.
Default behavior of toString() is to print class name, then @, then unsigned hexadecimal representation of the hash code of the object.
*/

class person{
  String name;
  String address;
  person(String name,String address){
    this.name=name;
    this.address=address;
    }
  String getname(){
    return name;
   }
  void setAddress(String add){
    address=add;
    }
   String getAddress(){
    return address;
    }
   
  String tostring(){ //overriding to
   return name+" "+address;
   }
  }
  
 class student extends person{
  int numCourses;

  String courses[];
  HashMap<String,Integer> hashmap;
  student(String name,String address){
   super(name,address);
   numCourses=0;
   hashmap=new HashMap<String,Integer>();
   }  
   
  void addCoureGrade(String course,int grade){
  if(numCourses==30){
   System.out.println("courses limit exceeded");return ;
   }
    hashmap.put(course,grade);
    numCourses++;
    } 
  void printgrades(){
  hashmap.forEach((k,v)->System.out.println(k+" : "+v));
  }
  
  double getAverageGrade(){
     double avg=0;
        for(Map.Entry<String,Integer> ele:hashmap.entrySet()){
           avg+=ele.getValue();
          }
        return avg/numCourses;
      }
      
}

class teacher extends person{
  int numcourses;
   ArrayList<String> courses;
   teacher(String name,String address){
   super(name,address);
     numcourses=0;
     courses=new ArrayList<String>();
     
    } 
   
   void addCourse(String course){
    
     if(courses.contains(course)) {
      System.out.println("course exists");return;
      }
     if(numcourses==5) {
    System.out.println("courses limit exceeded");
    return ;
    }
     courses.add(course);numcourses++;
    
     }
    void remCourse(String course){
     if(courses.contains(course)==false) {
        System.out.println("course doesn't exist");return;
      }
     courses.remove(course);
     }
   
 }
 
 class courses{
  public static void main(String args[]){
     student s1=new student("ram","karimnagar");
     System.out.println(s1.getname());
      System.out.println(s1.tostring());
      s1.addCoureGrade("os",9);
      s1.addCoureGrade("dbms",8);
      s1.addCoureGrade("daa",10);
      s1.addCoureGrade("dsa",9);
      s1.printgrades();
      System.out.println(s1.numCourses);
      System.out.println(s1.getAverageGrade());
      teacher t=new teacher("keshav","hyderabad");
      t.addCourse("os");
      t.addCourse("dbms");
      t.addCourse("daa");
      t.addCourse("os");
      t.addCourse("c");
       t.addCourse("dsa");
       t.remCourse("dbms");
       t.remCourse("cpp");
       t.addCourse("osd");
     }}
     
   
  
  
