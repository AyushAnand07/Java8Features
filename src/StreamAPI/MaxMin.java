package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public static void main(String []args){
//List
        List<Integer> ls = Arrays.asList(2,5,44,3,57,34,59);

        int max= ls.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        int min= ls.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);

//Arrays
        int[] array = {2,4,2,5,7,88,77,5,4};
        int maxar = Arrays.stream(array).max().getAsInt();
        System.out.println(maxar);

        int minar = Arrays.stream(array).min().getAsInt();
        System.out.println(minar);
    }
}
