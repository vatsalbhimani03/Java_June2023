package aug12PracticeQuestion1;

public class Penguin implements Animal, Swimmable{
    @Override
    public void feed() {
        System.out.println("Penguin is feeding");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin is making Sound");

    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");

    }
}
