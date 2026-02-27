class Method{
    public int add(int x, int y, int z){
        return x+y+z;
    }
    public int add(int x, int y){
        return x+y;
    }
}
public class Demo3 {
    public static void main(String []args){

        int a = 3;
        int b = 7;
        int c = 10;

        Method obj = new Method();
        System.out.println("Single Method : "+obj.add(a,b));
        System.out.println("Extra Method : "+obj.add(a,b,c));
    }
}
