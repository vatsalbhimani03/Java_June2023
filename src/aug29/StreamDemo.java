package aug29;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        // before java 8 - print even numbers
//        for (Integer newList: list) {
//            if(newList % 2 == 0){
//                System.out.println(", "+newList);
//            }
//        }

        // after java 8 - print even numbers
//        list.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));
        list.stream().filter(x -> x%2==0).forEach(System.out::println);

        // Method reference - Spread Operator (::) - access methods inside the class

        List<Integer> evenNumbers = list
                .stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);


    }
}
