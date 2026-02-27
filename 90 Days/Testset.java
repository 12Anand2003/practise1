import java.util.*;
public class Testset {
    public static void main(String []args){
        Set<Integer> s = new HashSet<>();

        Set<Integer> a = Set.of(10);
        System.out.println(a);

        s.add(20);
        s.add(30);
        s.add(20);

        for(int x : s){
            System.out.println(x);
        }
    }
}
