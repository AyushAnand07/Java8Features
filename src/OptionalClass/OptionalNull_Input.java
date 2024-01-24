package OptionalClass;

import java.io.IOException;
import java.util.Optional;

public class OptionalNull_Input {
    public static void main(String a[])throws IOException
    {
        String s = null;
        Optional<String> stringOptional = Optional.ofNullable(s);
        // System.out.println(stringOptional.get()); It will give NoElementException as Sting s is null so to avoid we do below steps

        if (stringOptional.isPresent()) //isPresent to avoid nullException
        {
            System.out.println(stringOptional.get());
        }
        else
        {
            String str = stringOptional.orElse("Default"); //print default value if present otherwise orELse will print assigned value
            System.out.println("Value not present and default value is "+str);
        }
    }
}
