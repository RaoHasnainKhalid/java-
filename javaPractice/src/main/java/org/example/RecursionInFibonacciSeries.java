package org.example;
import java.util.Scanner;
public class RecursionInFibonacciSeries {
    static int FibonacciSeries(int x)
    {
        if(x<=1)
        {
            return 1;
        }
        else
        {
            return x = FibonacciSeries(x-1)+FibonacciSeries(x-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(FibonacciSeries(a));
    }

}
