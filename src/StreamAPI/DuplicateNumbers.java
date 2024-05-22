package StreamAPI;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumbers {
    public static void main(String []args)throws IOException{
        List<Integer> ls = Arrays.asList(2,4,5,2,55,5,80,7,6,6,1,2);

        Set<Integer> result= ls.stream().filter(e-> Collections.frequency(ls,e)>1).collect(Collectors.toSet());
        System.out.println(result);
    }
}
