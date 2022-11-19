package org.example;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        System.out.println("Percentage Of student:");
        Scanner subNum = new Scanner(System.in);
        System.out.println("Enter 1st Subject Number:");
        byte sub1 = subNum.nextByte();
        System.out.println("Enter 2nd Subject Number:");
        byte sub2 = subNum.nextByte();
        System.out.println("Enter 3rd Subject Number:");
        byte sub3 = subNum.nextByte();
        System.out.println("Enter 4th Subject Number:");
        byte sub4 = subNum.nextByte();
        System.out.println("Enter 5th Subject Number:");
        byte sub5 = subNum.nextByte();
        float perc = ((sub1+sub2+sub3+sub4+sub5)*100)/500;
        System.out.println(perc);

    }
}
