package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String []args){

        List<Integer> ls = Arrays.asList(3,6,4,7,9,4,2,4,1);

        List<Integer>ascending = ls.stream().sorted().toList();
        System.out.println(ascending);

        List<Integer>descending = ls.stream().sorted(Collections.reverseOrder()).toList();
        System.out.println(descending);
    }
}
