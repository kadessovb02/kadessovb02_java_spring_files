package lesson30;

import java.util.ArrayList;
import java.util.function.*;
class Student {

    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student(String name, char sex, int age, int course, double avgGrade){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentInfo {
    void printStudent(Student st) {
        System.out.println(
                " name: " + st.name +
                        " sex: " + st.sex +
                        " age: " + st.age +
                        " course: " + st.course +
                        " avgGrade: " + st.avgGrade
        );
    }
    void testStudents(ArrayList<Student> list, Predicate<Student> ps) {
        for (Student st : list) {
            if (ps.test(st)) {
                printStudent(st);
            }
        }
    }
}
public class test52 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Bek", 'm', 19,1, 9.5));
        list.add(new Student("Talga", 'm', 18,1, 9.5));
        list.add(new Student("Dauka", 'm', 18,1, 7.5));
        list.add(new Student("Dilya", 'f', 18,1, 10));
        StudentInfo si = new StudentInfo();
        si.testStudents(list, (Student st) ->{return st.avgGrade > 9;});
    }
}
