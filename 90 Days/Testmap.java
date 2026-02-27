import java.util.*;
public class Testmap {
  public static void main(String []args){
    Map<String, Integer> arr = new HashMap<>();
    arr.put("Ishant",100);
    arr.put("Nikita", 200);
    arr.put("Anand", 500);

    for(Map.Entry<String, Integer> e : arr.entrySet()){
        System.out.print(e.getKey()+"----");
        System.out.println(e.getValue());
        System.out.println("-----");
    }

    Optional<Integer> mOfAman = Optional.of(arr.get("Ni"));
    System.out.println(mOfAman);
    if(mOfAman.isPresent()){
      ///
    }
    else{
      System.out.println("Nothing");
    }
  }  
}
