package lesson22;

public class Person {
    final String sex;
    Person(String sex) {
        this.sex = sex;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String s) {
        name = s;
    }
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int a){
        if (a > 0 && a < 150){
            age = a;
        }
    }
    private double weight;
    public double getWeight() {
        return weight;
    }
    public void setWeight(double a){
        if (a > 0 && a < 500){
            weight = a;
        }
    }
}
class Test{
    public static void main(String[] args) {
        Person p = new Person("male");
        p.setName("Bek");
    }

}
