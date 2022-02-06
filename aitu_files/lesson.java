package Bek.aitu_files;
public class lesson {
    public static void main(String[] args) {
        Student[] st = {
                new Student(
                        "Bek",
                        "Kadessov",
                        "BDA-2103",
                        5
                ),
                new Student(
                        "A",
                        "B",
                        "BDA-2104",
                        4.7
                )
        };
        Student[] asp = {
                new Aspirant(
                        "A",
                        "B",
                        "C",
                        4.5
                ),
                new Student(
                        "AA",
                        "BB",
                        "CC",
                        5
                )
        };

        st[0].averageMark = 5;
        asp[0].averageMark = 4;
        for (int i = 0; i < 2; i++) {
            System.out.println("Student "+ st[i].firstName + " " + st[i].lastName + " scholarship: " + st[i].getScholarship());
            System.out.println("Student "+ asp[i].firstName + " " + asp[i].lastName + " scholarship: " + asp[i].getScholarship());
        }
    }
}
class Student{
     protected String firstName, lastName, group;
     protected double averageMark;
    Student(){}
    Student(String firstName, String lastName, String group, double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public int getScholarship(){
        return (averageMark == 5) ? 100000 : 80000;
    }
}
class Aspirant extends Student{
    Aspirant (String firstName, String lastName, String group, double averageMark){
        super(firstName, lastName, group, averageMark);
    }
    void researchWork(){}
    public int getScholarship(){
        return (super.averageMark == 5) ? 200000 : 180000;
    }
}