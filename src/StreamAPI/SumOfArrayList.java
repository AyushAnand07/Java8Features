package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfArrayList {
    public static void main(String []args){
        List<Integer>ls = Arrays.asList(3,5,2,6,7,8);

        Optional<Integer> sum = ls.stream().reduce((a, b)->a+b);
        System.out.println(sum.get());
    }
}
