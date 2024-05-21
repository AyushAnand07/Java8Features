package FunctionalInterface;

interface Abc
{
    static void sayHello()
    {
        System.out.println("Hi from Static method in interface");
    }
}
public class ParentStatic implements A{
    public static void main(String []args)
    {
        Abc.sayHello();
    }
}
