package Generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        int a = 5;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(a);
        System.out.println(GenMethod.getSecondElement(arrayList));
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("3");
        arrayList2.add("a");
        System.out.println(GenMethod.getSecondElement(arrayList2));
    }
}
class GenMethod{
    public static <T>T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
