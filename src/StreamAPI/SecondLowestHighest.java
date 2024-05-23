package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighest {
    public static void main(String []args){

        List<Integer> ls= Arrays.asList(0,2,5,9,8,1,6,7,1);
        int low= ls.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
        System.out.println(low);

        int high= ls.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(high);
    }
}
