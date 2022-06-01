package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<Number> list = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        showListInfo(list);
        List<?> list1 = new ArrayList<Integer>();
        List<String> list2 = new ArrayList<String>();
        list2.add("Hello");
        list2.add("world");
        showListInfo(list2);
        // ? - wildcards

        ArrayList<Double> ald = new ArrayList<>();
        ald.add(5.3);
        ald.add(3.14);
        ald.add(1.25);
        System.out.println(sumOfElements(ald));
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(5);
        ali.add(10);
        ali.add(15);
        System.out.println(sumOfElements(ali));
    }
    static void showListInfo(List<?> list){
        System.out.println("My list: " + list);
    }
    public static double sumOfElements(ArrayList<? extends Number> list){
        double summ = 0;
        for (Number n:
             list) {
            summ+=n.doubleValue();
        }
        return summ;
    }
}
