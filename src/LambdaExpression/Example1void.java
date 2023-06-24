package LambdaExpression;

import java.io.IOException;

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