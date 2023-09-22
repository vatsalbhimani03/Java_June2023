package Assignments;

class Calculator{
    private double num1;
    private double num2;

//        Define a parameterized constructor which takes two parameters num1 and num2 and assigns these variables to the respective fields in the class.
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        System.out.println("Addition of "+num1+" and "+num2+" : " + (num1 + num2));
        return num1 + num2;
    }
    public double subtract(){
        System.out.println("Subtraction of "+num1+" and "+num2+" : "+ (num2 - num1));
        return num2 - num1;
    }
    public double multiply(){
        System.out.println("Multiplication of "+num1+" and "+num2+" : "+ num1 * num2);
        return num1 * num2;
    }
    public double divide(){
        System.out.println("Division of "+num1+" and "+num2+" : "+ num2 / num1);
        return num2 / num1;
    }

}
public class ConstructorA5 {

    public static void main(String[] args) {
//        Write a Java class called Calculator with
//        private fields:num1 and num2 (double type)
//        num1 and num2 (double type)
//        And methods:
//        add(), a method which returns the addition of two numbers
//        subtract(), a method which returns the subtraction of num1 from num2
//        multiply(), a method which returns the multiplication of numbers
//        divide(), a method which returns the division of num2 by num1
//        Define a parameterized constructor which takes two parameters num1 and num2 and assigns these variables to the respective fields in the class.
//        Input
//        Pass double point numbers in the parameterized constructor
//                Output
//        addition, subtraction, division, and multiplication

        Calculator calculator = new Calculator(50, 200);
        calculator.add();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();
    }
}
