package LambdaExpression;

import java.io.IOException;

//A lambda expression is a short block of code which takes in parameters and returns a value.
//Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

interface Example
{
    void String(String name);
}

class testA
{
    public static void main(String args[])throws IOException
    {
        Example obj = (String s)->System.out.println(s);
        obj.String("Ayush");

        Example obj1 = (String ss)->System.out.println("Anand");
        obj1.String("Anand");
    }
}