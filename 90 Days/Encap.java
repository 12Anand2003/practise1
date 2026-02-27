class Abc{
    //This is Encapsulation no one from outside can access it.
    private int age = 20;
    private String name = "Aman";

    // See here i haven't used any get word then also it's working and same goes for setter also.
    // But for easy to understand we write get and set to make things preety easy.
    public int A(){
        return age;
    }

    // This is setter and setter method type should be void because it doesn't return anything.
    public void A(int age){
        this.age = age;
    }

    public String getN(){
        return name;
    }

    public void setN(String n){
        name = n;
    }
}

public class Encap {
    public static void main (String a[]){

        Abc obj = new Abc();
        obj.A(22);
        obj.setN("Anand");

        System.out.println(obj.A() +" "+ obj.getN());
    }
}
