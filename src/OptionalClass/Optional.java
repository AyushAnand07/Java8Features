package OptionalClass;
import java.util.Optional;
import java.io.IOException;
//The Optional class in Java 8 is a container object which is used to contain a value that might or might not be present.
//It was introduced as a way to help reduce the number of NullPointerExceptions that occur in Java code.

 class OptionalDemo {
    public static void main(String a[])throws IOException
    {
        String str = "Hey";
        Optional<String> stringOptional = Optional.of(str);
        System.out.println(stringOptional.get());
    }
}
