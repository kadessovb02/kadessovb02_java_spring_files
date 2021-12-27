package Lesson11;

public class Employee {
    public String name;
    public double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public double multiplier (double a){
        a *= 2;
       return a;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 105.5);
        double d = emp1.multiplier(emp1.salary);
        double b = emp1.salary;
        System.out.println(d);
        System.out.println(b);
    }
}