package StreamAPI;

import java.io.IOException;
import java.util.Arrays;

public class SumOfArray {
    public static void main(String []args)throws IOException{
        int []arr = {2,5,3,8,12,9};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
