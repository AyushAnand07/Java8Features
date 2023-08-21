package StreamAPI;
//Java streams represent a pipeline through which data will flow and the functions to operate on the data.
//A pipeline consists of a stream source, followed by zero or more intermediate operations, and a terminal operation.


import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Demo
{
    public static void main(String args[])throws IOException {
        List<Integer> num = Arrays.asList(2, 4, 6, 8, 9);

//        Stream<Integer> st = num.stream(); //stream() returns Stream type of values          1
//        st.forEach(n->System.out.println(n));
//        st.forEach(n->System.out.println(n)); //Will give error as One Stream can only be used/consumed one time.


        //returns Stream type values
//         Stream<Integer> dub = st.map(n->n*2);// map function accepts value from stream to perform actions on it inside ()    2
//        dub.forEach(n->System.out.println(n));               //        3
//       Combining 1,2,3 we will get stream API Lambda Expression

        num.stream().map(n->n*2).forEach(m->System.out.println(m));
        //Total 3 streams are created together, 1 for .stream 2 for .map and 3 for .forEach
        //Memory wont be consumed since 1 stream memory will be replaced by new stream after used once.
   }
}