package aug12PracticeQuestion1;

public class Monkey implements Animal, Climbable {
    @Override
    public void feed() {
        System.out.println("Monkey is feeding");

    }

    @Override
    public void makeSound() {
        System.out.println("Monkey is making sound");

    }

    @Override
    public void climb() {
        System.out.println("Monkey is climbing");

    }
}
