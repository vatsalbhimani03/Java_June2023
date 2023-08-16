package aug8;

public class Test {
    public static void main(String[] args){
        Car car = new Car("Lexus", "White", 2023, 1000);
        car.printDetails();

        Animal cat = new Cat();
        cat.makeSound();
        Animal dog = new Dog();
        dog.makeSound();

    }
}
