package aug26.PractiseW3Resources;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // 1.write lambda expression to find sum of 2 numbers
        TestInteger sum = (x,y) -> {
            System.out.println(x+y);
        };
        sum.test(10,5);

        // 2.write lambda expression to check if a given string is empty
        TestString givenStringIsEmpty = (x) -> {
            return x.isEmpty();
        };
        System.out.println(givenStringIsEmpty.test(""));

//        Predicate<String> givenString = (x) -> x.length() != 0;
//        System.out.println(givenString.test(""));


        // 3.write lambda expression to convert a list of strings to uppercase and lowercase.

    }
}
