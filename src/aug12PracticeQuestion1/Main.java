package aug12PracticeQuestion1;

//        Create an interface Animal with methods feed() and makeSound() to represent basic animal behaviors.
//        Create interfaces for specific behaviors, such as Swimmable with methods swim() for aquatic animals and Climbable with methods climb() for animals that can climb.
//        Implement classes for different animal types (e.g., Lion, Penguin, Monkey) that implement the relevant interfaces.
//        Each animal type should exhibit its unique behaviors, such as a lion roaring and a penguin swimming.
//        Design the architecture to allow the addition of new animal types with minimal code changes.


public class Main {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.feed();
        monkey.makeSound();
        monkey.climb();

        Penguin p = new Penguin();
        p.swim();
        p.makeSound();
        p.feed();

//        Lion lion = new Lion();
        Animal lion = new Lion();
        lion.feed();
        lion.makeSound();

    }
}
