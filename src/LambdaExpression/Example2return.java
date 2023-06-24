package LambdaExpression;

import java.io.IOException;

interface Example2
{
    int add(int a,int b);
}

class tryExample2 {
    public static void main(String args[]) throws IOException {
        Example2 e1 = (int a, int b) -> {
            return a + b;
        };
        int n = e1.add(5,12);
        System.out.println(n);
    }
}