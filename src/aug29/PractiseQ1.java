package aug29;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PractiseQ1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,23,25);

        System.out.println(list);

        // storing all the numbers in another list using stream which is greater than 10 and less than 20
//        list.stream().filter(x -> x>10 && x<20).forEach(x -> System.out.println(x));
        List<Integer> newList = list.stream().filter(x -> x>10 && x<20).collect(Collectors.toList());
        System.out.println(newList);


        List<String> names = Arrays.asList("Peter", "Mike","John", "Jane","Dan","Jennifer", "Mike","John", "Jane");

        // filter name start with J
        names.stream().filter(name -> name.startsWith("J")).forEach(x -> System.out.println(x));

        // filter name that has length greater than 4
        List<String> newStrList = names
                .stream()
                .filter(name -> name.startsWith("J"))
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());
        System.out.println(newStrList);

        List<String> newStr1List = names
                .stream()
                .filter(name -> name.startsWith("J"))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(newStr1List);

    }
}
