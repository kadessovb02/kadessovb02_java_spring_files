package aitu_files;
import java.util.ArrayList;
import java.util.Scanner;
//import java.io.*;sss
public class AssignmentOne {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        Point [] p = new Point[num];
        inp.nextLine();
        for (Point temp: p)
            temp.setter(inp.nextInt(), inp.nextInt());
    }
}
class Point {
    int x, y;
    public void getter(){System.out.println(x + ", " + y);}
    public void setter(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Shape{
    ArrayList <Point> list = new ArrayList<>();
    void addPoint(Point p) {list.add(p);}
    void getPoints(){
        for (Point xy: list)
            xy.getter();
    }
    double distance(Point p1, Point p2) {
        double d = Math.sqrt(Math.pow(p1.x, 2) + Math.pow(p2.x, 2));
        System.out.println("Distance: " + d);
        return d;
    }
    void calculatePerimeter(){
        double pm = 0;
        for (int i = 0; i < list.size(); i++)
            i++;
    }
    void longestSide(){

    }
}