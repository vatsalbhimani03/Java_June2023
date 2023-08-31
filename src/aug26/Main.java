package aug26;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            public void makingNoise() {
                System.out.println("Animal is Making Noise");
            }
        };

        Animal animal2 = () -> System.out.println("Animal is Making Noise");

//    Car car = (int 10,int 200) -> {
//        System.out.println("The average of Car is ");
//    };
//

        // Lambda Function of Calculator Interface
        Calculator calculator = (a,b) -> {
            int c = a+b;
            return c;
        };
        System.out.println(calculator.calculate(10, 20));


        // Lambda Function of Vehicle Interface
        Vehicle vehicle = (model) -> {
            return "It's a "+ model +" model of the vehicle";
        };
        System.out.println(vehicle.run("Toyota"));


        // Lambda Function of Furniture Interface
        Furniture furniture = (shape) -> {
            return "It's a "+shape+" shape";
        };
        furniture.size("Rectangle");


        // Lambda Function of Coffee Interface
        Coffee coffee = (size, type) -> {
            System.out.println("It's a medium french vanilla coffee");
        };

        // Lambda Function of Nothing Interface
        Nothing nothing = () -> {
            System.out.println("There is something here");
        };
        nothing.something();


    }

}
