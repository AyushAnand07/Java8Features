package FunctionalInterface;

interface df
{
    static void sayHello()
    {
        System.out.println("Hi from Static method in interface");
    }

    default void sayBye()
    {
        System.out.println("Bye from Default method in interface");
    }
}

//note-implementation class Default_Static cant see static methods of interface at all,so we can define same sayHello() in this class without overriding
public class Default_Static implements df{
    public static void main(String []args)
    {
        df.sayHello();
        Default_Static defaultStatic= new Default_Static();
        defaultStatic.sayBye();
    }
}
