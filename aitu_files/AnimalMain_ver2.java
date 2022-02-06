package Bek.aitu_files;

import java.util.ArrayList;

public class AnimalMain_ver2{
    public static void main(String[] args) {
        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(new Dog("Laika"));
        animal.add(new Cat("Tigrenok"));
        animal.add(new Horse("Bucifal"));
        Veterinary vt = new Veterinary();
        vt.treatAnimal(animal);
    }
}
abstract class Animal{
    protected String food;
    abstract void makeNoise();
    abstract void eat();
    abstract void sleep();
}
class Dog extends Animal{
    private String name;
    Dog(String name){
        this.name = name;
    }
    void makeNoise(){System.out.println("Gaf Gaf");};
    void eat(){System.out.print("Dog eats ");};
    void sleep(){System.out.println("Dog sleep");};
    String getter(){
        return name;
    }
}
class Cat extends Animal{
    private String name;
    Cat(String name){
        this.name = name;
    }
    void makeNoise(){System.out.println("Myau Myau");};
    void eat(){System.out.print("Cat eats ");};
    void sleep(){System.out.println("Cat sleep");};
    String getter(){
        return name;
    }

}
class Horse extends Animal{
    private String name;
    Horse(String name){
        this.name = name;
    }
    void makeNoise(){System.out.println("Yhao!");};
    void eat(){System.out.print("Horse eats ");};
    void sleep(){System.out.println("Horse sleep");}
    String getter(){
        return name;
    }
}
class Veterinary{
    void treatAnimal(ArrayList<Animal> animalList){
        for (Animal animal : animalList) {
            animal.eat();
            if(animal instanceof Dog){
                animal.food = "meat";
            }
            if (animal instanceof Cat){
                animal.food = "kitty kat";
            }
            if (animal instanceof Horse){
                animal.food = "grass";
            }
            System.out.print(animal.food);
        }
    }
}
