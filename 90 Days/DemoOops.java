

class Oops{
    public int add(int n1, int n2){
        return n1+n2;
    }
}
public class DemoOops {
    public static void main(String [] args){
        int a = 9;
        int b = 11;

        Oops obj = new Oops();
        int result = obj.add(a,b);
        System.out.println(result);
    }
}
