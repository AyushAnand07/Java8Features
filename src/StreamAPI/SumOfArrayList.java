package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfArrayList {
    public static void main(String []args){
        List<Integer>ls = Arrays.asList(3,5,2,6,7,8);

        int sum = ls.stream().reduce((a, b)->a+b).get();
        System.out.println(sum);
    }
}
