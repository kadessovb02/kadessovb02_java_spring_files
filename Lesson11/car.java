package Lesson11;

public class car {
    String color;
    String engine;
    int DoorNumber;
    car(String color, String engine, int DoorNumber){
        this.color = color;
        this.engine = engine;
        this.DoorNumber = DoorNumber;
    }
    public static void main(String[] args){
        car c1 = new car("Red", "V6", 4);
        car c2 = new car("Blue", "V8", 2);
        CarTest ct = new CarTest();
        ct.NumberChange(c1);
        ct.ExChange(c1, c2);

    }   
}
class CarTest{
    public void NumberChange(car c){
        c.DoorNumber /= 2;
    }
    public void ExChange(car c1, car c2){
        car c3 = c2;
        c1.DoorNumber = c2.DoorNumber;
        c2.DoorNumber = c3.DoorNumber;
    }
}
