package Lesson20;
import java.util.ArrayList;
public class test {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Bek");
        list.add("Kadessov"); // dynamic array
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Name: ");
        list2.add("Jaksylykuly");
        list.addAll(0, list2);
        for(String s : list){
            System.out.println(s + " ");
        }
        list2.set(0, "PhIO: ");
    }
}
