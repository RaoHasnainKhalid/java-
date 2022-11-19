package org.example;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type Your Name");
        System.out.println("Type Your First Name");
        String fName = input.next();
        System.out.println("Type Your Last Name");
        String lName = input.next();
        System.out.println(fName + " " + lName );
    }
}
