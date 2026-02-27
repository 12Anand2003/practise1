import java.util.*;
class Test{
  int x = 5;
    public int a(){
        return x;
    }
}
public class Learning {
    public static void main(String []args){
    Test o = new Test();
    
    Test o1 = new Test();
    o1.x = 12;// Chaning class variable from here .
   
    System.out.println(o1.a());
    System.out.println(o.a());
}
}
