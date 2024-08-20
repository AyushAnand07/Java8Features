package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWith {
    public static void main(String []args){

        List<Integer>ar =Arrays.asList(2,24,35,44,26,222,240,25);

        List<Integer> result= ar.stream().map(String::valueOf)
                .filter(e->e.startsWith("2"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
