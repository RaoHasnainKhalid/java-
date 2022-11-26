package org.example;
import java.util.Scanner;
public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i=1; i<=5; i++)
//        {
//            for (int j=5; j>=i; j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        System.out.println("Enter Any number for to find sum of even number: ");
//        int a = sc.nextInt();
//        int sum =0;
//        for(int i=0; i<=a; i++)
//        {
//            if(i%2==0)
//            {
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);

        //Factorial For Loop
//        System.out.println("Enter Any number to find the factorial of a number: ");
//        int a = sc.nextInt();
//        int fac =1;
//        for(int i=a; i>=1; i--)
//        {
//            fac = fac*i;
//        }
//        System.out.println(fac);

        // Factorial With Do while
//        System.out.println("Enter Any number to find the factorial of a number: ");
//        int a = sc.nextInt();
//        int fac =1;
//        int i = a;
//        do
//        {
//            fac = fac*i;
//            i--;
//        }
//        while (i>=1);
//        System.out.println(fac);

        // Sum of Any Table

        System.out.println("Enter Any number to find the Sum of Table : ");
        int a = sc.nextInt();
        int sum =0;
        for(int i=1; i<=10; i++)
        {
            sum = sum +(a * i);
        }
        System.out.println(sum);
    }
}
