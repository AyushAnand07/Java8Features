package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfNumberInArrayList {
    public static void main(String []args)
    {
        List<Integer> arr = Arrays.asList(2,6,4,8,9);
        //mapToInt converts each stream object into int before it can calculate average
        OptionalDouble sum = arr.stream().mapToInt(n->n).average();
        System.out.println(sum.getAsDouble());
    }
}
