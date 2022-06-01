package Generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<Integer,String> pair = new Pair<>(23,"Bek");
        Pair<Double,String> pair2 = new Pair<>(23.5,"Test2");
        System.out.println(pair);
        System.out.println(pair2);
    }
}
class Pair<V1,V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
