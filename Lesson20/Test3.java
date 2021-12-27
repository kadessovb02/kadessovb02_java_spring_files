// lesson 20 part 3
package Lesson20;
//import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1: " + al1);
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("one");
        al2.add("two");
        al2.add("four");

        // removeAll method:
        /*
        al1.removeAll(al2); // removes all second arraylist values in main arraylist
        System.out.println("Removing: " + al2);
        System.out.println("al1: " + al1);
        */

        // retainAll method:
        /*
        al1.retainAll(al2);
        System.out.println("Leave these numbers in list: " + al2);
        System.out.println("Left numbers: " + al1);
        */

        //containsAll method:
        /*
        boolean answer = al1.containsAll(al2);
        System.out.println(answer);
        */

        //subList method:
        System.out.println("al1: " + al1);
        System.out.println("subList index from 2 to 3: " + al1.subList(2, 4));

        //toArray method:
        /*
        Object [] array = al1.toArray();
        String [] S_array = al1.toArray(new String[5]);
        */

        //List.of method:
        //main rule: we can not change list values
        /*
        List<String> list = List.of("Hello", "hi", "bye"); // overloaded method of, also we cannot change values in list
        List<String> list2 = List.copyOf(al1);
        */

        Map <Integer, String> map = new HashMap<>();
        map.put(209, "Bek");
        map.put(307, "Era");
        System.out.println("map: " + map);


    }
}
