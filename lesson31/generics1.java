package lesson31;

public class generics1 {
    public static void main(String[] args) {
        Info<String> s = new Info<String>("Hello!");
        Info<Integer> i = new Info<>(5);
        System.out.println(s.toString());
        System.out.println(i.toString());

    }
}
class Info<T> {
    T value;
    Info(T value){
        this.value = value;
    }
    public String toString(){
        return "value: " + value;
    }

}

