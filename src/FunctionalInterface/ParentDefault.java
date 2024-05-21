package FunctionalInterface;

//@FunctionalInterface used to check if interface is functional interface or not

//Implementation of default methods
interface A
{
    default void sayHello()
    {
        System.out.println("Hello from A interface");
    }
}

interface B
{
    default void sayHello()
    {
        System.out.println("Hello from B interface");
    }
}
public class ParentDefault implements A,B {
    public static void main(String[]args)
    {
        ParentDefault p = new ParentDefault();
        p.sayHello();
    }

    @Override //Overriding will help with ambiguity since we are providing implementation here
    public void sayHello() {
        A.super.sayHello();
    }
}
