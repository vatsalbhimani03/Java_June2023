package aug29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
//        flatmap - is something which flatten the map
//        when we use list of list then flatmap is being used

        List<String> names1 = Arrays.asList("Peter", "Mike","John", "Jane","Dan","Jennifer");
        List<String> names2 = Arrays.asList("Vatsal", "Tulsi","Sachin", "Milan");
        List<String> names3 = Arrays.asList("Chirag", "Nidhi","Mohit");

//        List<String> newList = new ArrayList<>();
//        newList.add(names1.toString());
//        newList.add(names2.toString());
//        System.out.println(newList);

        List<List<String>> allNames = Arrays.asList(names1, names2, names3);
        System.out.println(allNames);

        List<String> refinedList = allNames
                .stream()
                .flatMap(s->s.stream())
                .collect(Collectors.toList());
        System.out.println(refinedList);

        List<String> rl = refinedList.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.println(rl);
    }
}
