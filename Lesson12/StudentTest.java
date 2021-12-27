package Lesson12;

public class StudentTest {
    String groupName;
    int StudentNum;
    StudentTest(String groupName, int StudentNum){
        this.groupName = groupName;
        this.StudentNum = StudentNum;
    }
    public static void compareStudent(StudentTest s1, StudentTest s2){
        int temp = s1.StudentNum;
        s1.StudentNum = s2.StudentNum;
        s2.StudentNum = temp;
    }
    public static void main(String[] args) {
        StudentTest test1 = new StudentTest("Aa", 4);
        StudentTest test2 = new StudentTest("Bb", 5);
        compareStudent(test1, test2);


    }
}
