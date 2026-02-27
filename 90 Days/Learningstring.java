public class Learningstring {
    public static void main(String a[]){

        String name = "Anand";
        name = name + " Sinha";
        System.out.println(name);

        String name2 = new String("Ishant");
        System.out.println(name2.concat(" Rathi"));

        // From here stringbuffer has been started.

        StringBuffer sb = new StringBuffer("Navin");
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.length());
        sb.append(" Reddy");
        System.out.println(sb);
        //Navin has 5 words and there will be 16 more for an extra which it automatically increases
        //according to the length of word and remember length and capactiy are 2 different things.
        //here we can have limit also for string.

        // stringbuilder

        StringBuilder sbc = new StringBuilder("Hello");
        sbc.append(" World");
        System.out.println(sbc);
    }
}
