package lesson22;

public class inheritance {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan"; // наследство от класса Employee
        doc.age = 50;
        doc.eat();
        doc.sleep();
    }
}
class Employee{
    protected String name;
    protected int age;
    protected int experience;
    protected void eat(){System.out.println("eating");}
    protected void sleep(){System.out.println("sleep");}
}
class Doctor extends Employee{
void save(){System.out.println("lechit");}
}
class Teacher extends Employee{
    void teach(){System.out.println("teaching");}
}