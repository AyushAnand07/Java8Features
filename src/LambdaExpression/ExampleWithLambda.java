package LambdaExpression;

import java.io.IOException;

interface Display1
{
    void display();
}

class tryDisplay1
{
public static void main(String args[])throws IOException
{
    // Display1 a = new Display1() {           (Until java7 implementation of interface directly)
 //       @Override
 //       public void display() {
  //          System.out.println("Hello");
  //      }
  //  };
    Display1 a = ()->   //Java 8 lambda expression. Java can understand after = part as there is only 1 method in functional interface
    {
        System.out.println("Hello");
    };
    a.display();
}
}