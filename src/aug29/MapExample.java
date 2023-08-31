package aug29;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> n = nums.stream().map(x -> x*2).collect(Collectors.toList());
        System.out.println(n);

        List<String> names = Arrays.asList("Peter", "Mike","John", "Jane","Dan","Jennifer", "Mike","John", "Jane");

        // converts all of these names to upper case
        // filter with length
        // greater than 4
        List<String> str1 = names
                .stream()
                .map(name -> name.toUpperCase())
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());
        System.out.println(str1);

        List<Integer> str2 = names
                .stream()
                .map(s-> s.length())
                .collect(Collectors.toList());
        System.out.println(str2);

        names.stream().mapToInt(s-> s.length()).forEach(s-> System.out.println(s));



    }
}
