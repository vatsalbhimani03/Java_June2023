package aug26.inbuildLamdas;

import java.util.function.*;

public class Test {
    public static void main(String[] args) {

        // These are build in lambdas (functional interface):
        // Consumer, BiConsumer, Predicate, Supplier, Runnable

        // Consumer - accepts 1 input(type T) and returns nothing. (which consumes 1 value)
        Consumer<String> consumer = (x) -> {
            System.out.println(x);
            System.out.println(x.length());
            System.out.println(x.trim());
            System.out.println(x.trim().length());
        };
        consumer.accept("   Vatsal       ");

        // BiConsumer - accepts 2 input(types T and U) and returns nothing. (which consumes 1 value)
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
            System.out.println("Sum of "+x+" and "+y+" is: "+ (x+y));
        };
        biConsumer.accept(299, 78);

        // Predicate - takes 1 input(type T) and returns boolean value
        Predicate<Integer> predicate = (x) -> x%2 == 0;
        System.out.println(predicate.test(15));

        // Supplier - takes nothing but returns value; (which supplies value)
        Supplier<String> supplier = () -> "Hey, it's Vatsal";
        String x = supplier.get();
        System.out.println(x);

        // Function - takes 1 input and return value (takes type T and return value of type R)
        Function<String, Integer> function = z -> z.length();
        System.out.println(function.apply("Vatsal"));



    }
}
