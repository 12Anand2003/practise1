class Abc{
     int price; // instance Variable.
     String company; // instance Variable.
     static String type; // static Variable.

     // Method
    public void phone(){
        System.out.println(company +" "+price+" "+type );
    }

    // Static block
    static{
        type = "phone";
        System.out.println("This is static Block");
    }

    // Constructor
    //called upto n number of times that numbers depend upon how times we create object.
    public Abc(){
        System.out.println("This is a constructor ");
    }

    // Parameterzied constructor
    public Abc(int price, String company, String t){
        this.price = price;
        this.company = company;
        type = t;
    }

    // Static Method
    public static void Abc1(String company , int price, String type){
        System.out.println(company +" "+ price +" "+type);
       // System.out.println(obj.company +" "+obj.price+" "+type);
        // There will be an error in company and price we can't use them here directly
        // so we need here obj to passed as a variable.
    }
}
public class Staticvariable {
    public static void main(String a[]){

        Abc obj1 = new Abc();
        obj1.price = 1500000;
        obj1.company = "Samsung";
        obj1.type = "Flodable";
        
        // Sometimes things also depends upon when you call them.
        obj1.phone();

    

        Abc obj2 = new Abc();
       obj2.price = 1500000;
       obj2.company = "Apple";
       obj2.type = "Normal";
       
       obj2.phone();
       
      // If a static method needs to access instance variables,
      // we must pass the object reference as a parameter.
     // Inside the static method, we receive it like: Abc obj
     // Then we can access instance variables using obj.company, obj.price, etc.
        //Abc.Abc1(obj1);
        Abc.Abc1("Realme",400000, "Smartphone");
      

       Abc obj3 = new Abc(2,"Nokia","Dabaa");
       obj3.phone();

       Abc obj4 = new Abc();
       obj4.phone();

       new Abc(); // Anymonys object
       // we can't use this again.

    }
}
