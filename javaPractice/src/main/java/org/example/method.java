package org.example;
import java.util.Scanner;
public class method {
    static int rectangle(int x, int y){
        if(x>y)
            return x*y;
        else
            return (x+x)+(y+y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int l = sc.nextInt();
        System.out.println("Enter Width: ");
        int w = sc.nextInt();
        System.out.println(rectangle(l,w));
    }
}
