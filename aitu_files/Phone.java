package aitu_files;
import java.util.ArrayList;
import java.util.Scanner;
public class Phone {
    private long number = 87777777777L;
    String model;
    double weight;
    // перегруженный метод receiveCall с двумя параметрами

    long getNumber() {
        return number;
    }
    // возвращает номер телефона
    Phone() {} // Пустой конструктор
    Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }
    Phone(long number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }



}
class UserInfo{

    void printUser(ArrayList<Phone> list) {
        for (Phone ph : list) {
            System.out.println("user: " + ph.getNumber());
        }
    }

    void sendMessage(int limit) {
        long[] numbers = new long[limit];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < limit; i++)
            numbers[i] = input.nextLong();

        for (long p : numbers)
            System.out.println(p);
    }

    void receiveCall(Phone ph, String name) {
        System.out.println("Звонит " + name);
        System.out.println(ph.getNumber());
    }
}
class Main{
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        list.add(new Phone(87086865602L, "Samsung", 0.567));
        list.add(new Phone(87779085602L, "Samsung", 0.765));
        UserInfo uf = new UserInfo();
        uf.printUser(list);
    }
}
