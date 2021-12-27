package Lesson16;

public class Test1 {
    public static void main(String[] args) {
    String s1 = new String("privet my girl");
    int a = s1.length();
    System.out.println(a);   
    
    char c1 = s1.charAt(3);
    if(c1 == 'i')
        System.out.println("i");

    int index_of_p = s1.indexOf('p');
    System.out.println(index_of_p);

    int index_of_str = s1.indexOf(" ");
    System.out.println("ans: " + index_of_str + " real ans: " + 7);

    boolean ans = s1.startsWith("priveh");
    System.out.println("ans: " + ans);

    boolean ans2 = s1.startsWith("my", 7);
    System.out.println("ans: " + ans2);

    boolean ans3 = s1.endsWith("rl");
    System.out.println("ans: " + ans3);



    }
}
