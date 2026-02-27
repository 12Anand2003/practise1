class Music{

   public void Play(){
    System.out.println("Playing");
   }

   public String Pen(int cost){
    if(cost>=10)
        return "PEN";
    else 
        return "Nothing";
   }
}
public class Demo2 {
    public static void main(String args[]){

        Music obj = new Music();
        obj.Play();
        String str1 = obj.Pen(10);
        String str2 = obj.Pen(2);
        System.out.println(str2);
        System.out.println(str1);
    }
}
