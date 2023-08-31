package aug26.TestCase;

public class Main {
    public static void main(String[] args) {

        // creating lambda function for all +-*/ functions
        Calculator addition = (x,y) -> {
            int z = x+y;
            return z;
        };
        Calculator subtraction = (x,y) -> {
            int z = x-y;
            return z;
        };
        Calculator multiplication = (x,y) -> {
            int z = x*y;
            return z;
        };
        Calculator division = (x,y) -> {
            int z = x/y;
            return z;
        };

        // Calling those lambda functions with interface method
        System.out.println(
                "Addition: "+ addition.calculate(50, 50)+
                "\nSubtraction: "+ subtraction.calculate(50,50)+
                "\nMultiplication: "+ multiplication.calculate(50,50)+
                "\nDivision: "+ division.calculate(50,50)+"\n"
        );


        addition(
                (x,y) -> {
                    System.out.println("Addition of "+x+" and "+y+" is: ");
                    return (x+y);
                }
        );
        subtraction(
                (x,y) -> {
                    System.out.println("Subtraction of "+x+" and "+y+" is: ");
                    return (x-y);
                }
        );
        multiplication(
                (x,y) -> {
                    System.out.println("Multiplication of "+x+" and "+y+" is: ");
                    return (x*y);
                }
        );
        division(
                (x,y) -> {
                    System.out.println("Division of "+x+" and "+y+" is: ");
                    return (x/y);
                }
        );
    }


    public static void addition(Calculator cal){
        System.out.println(cal.calculate(50,50));
    }

    public static void subtraction(Calculator cal){
        System.out.println(cal.calculate(50,50));
    }
    public static void multiplication(Calculator cal){
        System.out.println(cal.calculate(50,50));
    }
    public static void division(Calculator cal){
        System.out.println(cal.calculate(50,50));
    }



}
