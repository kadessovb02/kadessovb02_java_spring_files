package lesson30;

public class test4 {
    static void print(test5 t){
        System.out.println(t.abc("Hello!"));
    }
    public static void main(String[] args) {
        print(x->x.length());
    }
}
interface test5{
    int abc(String s);
}
