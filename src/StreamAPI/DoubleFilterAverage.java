package StreamAPI;
//double every value, filter the values which are less than 100 and get their average
import java.util.Arrays;
import java.util.List;

public class DoubleFilterAverage {
    public static void main(String []args){
        List<Integer> ls = Arrays.asList(1,10,20,30,15);

        double avg= ls.stream().mapToInt(n->n).map(n->n*n).filter(n->n>100).average().getAsDouble();
        System.out.println(avg);
    }
}
