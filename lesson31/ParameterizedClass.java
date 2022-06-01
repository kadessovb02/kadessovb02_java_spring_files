package Generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("privet");
//        System.out.println(info1);
//
//        Info<Integer> info2 = new Info<>(18);
//        System.out.println(info1);
//        System.out.println(info2);
    }
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info){
//        Integer s = info.getValue();
//    }
//    // Для JVM все эти данные выглядят вот так:
//    // abc(Info info) - поэтому выдает ошибку, и мы не можем создавать
//    // перегруженные методы
//    // ---TYPE ERASURE---
}



class Info <T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}

class Parent{
    public void abc(Info<String> info){
        String s = info.getValue();
    }
}
class Child extends Parent{
//    public void abc(Info<Integer> info){
//        Integer s = info.getValue();
//    }
//    ++TYPE ERASURE
//    Ошибка компиляции
//    При Run time типы стриаются
}
