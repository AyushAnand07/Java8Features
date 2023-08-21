package StreamAPI;
//Sort values and print the double of only ODD values

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SortPrintDouble {
    public static void main(String args[])throws IOException{
        List<Integer> ls = Arrays.asList(5,2,8,2,9,3);

        ls.stream()
                .filter(n->n%2==1)       //returns true or false boolean values to proceed further accordingly
                .sorted()
                .map(m->m*2)
                .forEach(System.out::println); //Can also use Method reference sysout instead of lambda sysout
//                .forEach(s->System.out.println(s));       //Total 4 streams are created


//        int result = ls.stream()
//                .filter(n->n%2==1)
//                                      .sorted()  //not req since we are just calculating total in end
//                .map(m->m*2)
//                .reduce(0,(c,e)->c+e); //Used to reduce the whole answers to single value after calculation and returns Integer value
                                         //so have to store the total data in a int variable

        // System.out.println(result);
    }
}
