package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String []args){

        List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> even= ls.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> odd= ls.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(odd);

    }

}
