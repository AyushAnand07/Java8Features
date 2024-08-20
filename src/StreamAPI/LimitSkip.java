package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class LimitSkip {
    public static void main(String []args){

        List<Integer> ls= Arrays.asList(2,5,4,6,8,1,6,9,3);
        //sum of first 5 numbers

        int sum= ls.stream().limit(5).reduce(Integer::sum).get();
        System.out.println(sum);

        //sum after first 5
        int sumlast= ls.stream().skip(5).reduce((a,b)->a+b).get();
        System.out.println(sumlast);
    }
}
