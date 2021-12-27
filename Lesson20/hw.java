package lesson20;
import java.util.*;
public class hw {
    static ArrayList<String> abc(String ... a){
        ArrayList<String> list = new ArrayList<String>();
        for (String string : a) {
            if (list.contains(string)) {
                continue;
            }
            else {
                list.add(string);
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        System.out.println(abc("BBB", "AAA", "DDD", "CCC", "BBB", "AAA"));
    }
}