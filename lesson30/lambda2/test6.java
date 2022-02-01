package lesson30.lambda2;
import java.util.ArrayList;
import java.util.List;
public class test6 {
    public static void main(String[] args) {
        var list = List.of("Privet", "Poka", "bye");
        list.forEach(s->System.out.println(s));
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.removeIf(element->element%3==0);
        System.out.println(numbers);
    }
}
