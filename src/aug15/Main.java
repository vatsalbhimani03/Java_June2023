package aug15;

public class Main {
    public static void main(String[] args) {

    // We can't create object of Interface/Abstract class
    // We can create object of child class and reference it to parent interface or parent class.

        Furniture chair = new Chair();
        chair.sit();
        chair.stand();

//        Furniture table = new Table();
//        table.sit();
//        table.stand();

        // Anonymous inner class (Lambdas - Java 8)

        Furniture table = new Furniture() {
            @Override
            public void sit() {
                System.out.println("Sitting on the Table");
            }

            @Override
            public void stand() {
                System.out.println("Standing on the Table");
            }
        };
        table.sit();
        table.stand();
    }
}
