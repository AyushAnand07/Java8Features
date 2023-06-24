package ForEach;

import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {
    public static void main(String args[])throws IOException {
        List<String> str = Arrays.asList("Ayush", "Suyash", "Mridul", "Kevin");
//        Consumer<String> con = new Consumer<String>() {        (Inbuilt Consumer functional interface to be used to do forEach())
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        };
//        str.forEach(con);

//After removing all the unnecessary lines to make Lambda Exp since Consumer is functional interface which can only have 1 method.
        str.forEach(s->System.out.println(s));
    }
}
