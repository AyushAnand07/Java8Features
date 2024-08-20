package StreamAPI;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharOccurance {
    public static void main(String []args)throws IOException{
        String string = "aisidaaifisigg";
       // String []ar = string.split(""); converts string to string array of characters['a','b','t']
        Map<String, Long> result = Arrays.stream(string.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); //identity refers to each character in string
                                                                                             //on which we put counting
        System.out.println(result);

    }
}
