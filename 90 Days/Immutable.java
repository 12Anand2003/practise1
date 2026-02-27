import java.util.*;
public class Immutable {
    public static void main(String []args){
        List<String>s = List.of("A","B");
        // This the way of creating immutable list.

       // List<String>m = new ArrayList<>();
        // This the way of creating mutable list.

        s.add("D");
        // if throwing exception then it's correct.

        System.out.println(s);
    }
}
