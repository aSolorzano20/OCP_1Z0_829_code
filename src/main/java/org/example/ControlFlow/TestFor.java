package org.example.ControlFlow;

public class TestFor {

    public static void main(String[] args) {

        var sum = 0;
        int i = 0, j = 10;

        for ( ; sum > 20; i++, j--)      // 1
        {
            sum = sum+ i + j;
        }
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("Sum = " + sum);

    }
}
