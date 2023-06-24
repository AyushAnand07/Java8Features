package LambdaExpression;

//It provides a clear and concise way to represent one functional interface(one abstract method only) using an expression.
//It is very useful in collection library.
//It helps to iterate, filter and extract data from collection.
//Can use @FunctionalInterface annotation to maintain the rules of interface.

import java.io.IOException;

interface Display {
    void display();
}

//We cant create object of interface. Can only implement it.
class A implements Display
{
    public void display()
    {
        System.out.println("Hello");
    }
}

class TryA
{
    public static void main(String args[])throws IOException
    {
        A obj = new A();//obj is indirectly accessing interface method display()
        obj.display();
    }
}

