package lesson30;
import java.util.ArrayList;
import java.util.function.*;
public class homework30 {
    public static void main(String[] args) {
        var emps = new ArrayList<Employee>();
        emps.add(new Employee("Bek", "IT", 555000));
        emps.add(new Employee("Talga", "IT", 200000));
        emps.add(new Employee("Fair", "neIT", 100000));
        emps.add(new Employee("Era", "IT",800000));
        emps.add(new Employee("Era", "Era",450000));
        emps.add(new Employee("Beka", "IT",150000));
        emps.add(new Employee("Ema", "Finance",450000));
        var test = new testEmployee();
        System.out.println("Фильтр 1: ");
        test.filterEmployees(emps, emp->(emp.department.equals("IT")&&emp.salary>250000));
        System.out.println("-------------------------------------------");
        System.out.println("Фильтр 2: ");
        test.filterEmployees(emps, emp->(emp.name.startsWith("E")&&emp.salary!=450000));
        System.out.println("-------------------------------------------");
        System.out.println("Фильтр 3: ");
        test.filterEmployees(emps, emp->(emp.department.equals(emp.name)));
    }
}
class Employee{
    String name;
    String department;
    int salary;
    Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class testEmployee{
    void printEmployee(Employee emp){
        System.out.println(
                        "name: " + emp.name +
                        "; department: " + emp.department +
                        "; salary: " + emp.salary);
    }
    void filterEmployees(ArrayList<Employee> empList, Predicate<Employee> empPrd){
        for (Employee emp : empList) {
            if (empPrd.test(emp)){
                printEmployee(emp);
            }
        }
    }
}
