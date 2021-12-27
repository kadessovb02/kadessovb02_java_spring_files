package Lesson16;

public class Test2 {
    public static void main(String[] args) {
            String s1 = new String("asdfghjketiu");
            
            String s10 = s1.substring(3);
            
            String s11 = s1.substring(3, 7);
            System.out.println(s10 +" and "+ s11);

            String s2 = new String("      asdfghjketiu    ");
            String s12 = s2.trim();
            System.out.println(s2);
            System.out.println(s12);

            String s13 = s2.replace(' ', 'o');
            System.out.println(s13);
            String s14 = s2.replace("asd", "oooooppoooo");
            System.out.println(s14);

            System.out.println(s1 + "da");
    }
}
