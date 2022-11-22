package org.example;
import java.util.Scanner;
import java.util.Random;
public class RPSGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Enter Value");
        System.out.println("1: Rock");
        System.out.println("2: Paper");
        System.out.println("3: Scissor");
        int a = sc.nextInt();
        int b = rnd.nextInt(3)+1;
        System.out.println(b);
        if((a==1 && b==3) || (a==2 && b==1) || (a==3 && b==2))
        {
            System.out.println("You Win The Game");
        }
        else if(a==b)
        {
            System.out.println("Tie");
        }
        else
        {
            System.out.println("You Lose");
        }
        System.out.println("Computer Choose Any Number:" + b);
        }
}
