package ForEach;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String a[])throws IOException
    {
        List<Integer> ls = Arrays.asList(2,5,7,4,0,7);
/*        for(int i : ls)
        {
            System.out.println(i);
        }*/

        ls.forEach(i->System.out.println(i));
    }
}
