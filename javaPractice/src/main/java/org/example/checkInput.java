package org.example;
import java.util.Scanner;
public class checkInput {
    public static void main(String[] args) {
        System.out.println("Check Input Integar Or Not:");
        Scanner check = new Scanner(System.in);
        System.out.println(check.hasNextInt());

    }
}
