package lesson30.lambda2;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class car {
    String model;
    String color;
    double engine;
    car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }
    public String toString() {
        return "model: " + model + "; color: " + color + "; engine: " + engine;
    }
}
class test10{
    public static ArrayList<car> createThreeCars(Supplier<car> carSupplier){
        ArrayList<car> carArray = new ArrayList<car>();
        for (int i = 0; i < 3; i++) {
            carArray.add(carSupplier.get());
        }
        return carArray;
    }
}
