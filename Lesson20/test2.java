package Lesson20;
// lesson 20 part 2
import java.util.Arrays;
public class test2 {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        int [] b = {1, 2, 3, 5};
        int [] b2 = {1, 2, 3, 5};
        char[] ac = {'a', 'b', 'c', 'd', 'e'};
        char[] bc = {'a', 'b', 'c', 'd', 'f'};
        System.out.println(Arrays.compare(a, b)); // -1 if a < b
        System.out.println(Arrays.compare(ac, bc)); // +1 if ac > bc
        System.out.println(Arrays.compare(b,b2)); // 0 if b = b2
        // char[] nc = null;
        // null всегда меньше чем не null;
        System.out.println(Arrays.mismatch(a,b));   // 3, because from there its values become unsimilar
        System.out.println(Arrays.mismatch(b,b2));  // -1 if arrays are same
        System.out.println(Arrays.mismatch(ac,bc)); // 4
    }
}
// почти не используется, но на экзамене JAVA OCA будет
// нельзя сравнить через эти методы int и char
