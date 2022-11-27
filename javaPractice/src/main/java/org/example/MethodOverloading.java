package org.example;
import java.util.Scanner;
public class MethodOverloading {
    static void useMobile() {
        System.out.println("Xiaomi Mi Note 10 Lite");
    }

    static void useMobile(int x)
    {
        if (x > 50000) {
            System.out.println("One-plus 8");
        } else
            System.out.println("Poco X3 Pro");
    }
        static void useMobile ( int x, String y){
            System.out.println("Iphone 14 Pro Max");
        }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            useMobile();
            System.out.println("Enter Range: ");
            int a = sc.nextInt();
            useMobile(a);
            System.out.println("Enter Rage And Category: ");
            String b = sc.next();
            useMobile(a, b);
        }
}

