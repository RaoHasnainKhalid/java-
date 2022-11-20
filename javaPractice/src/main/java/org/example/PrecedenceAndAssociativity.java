package org.example;

public class PrecedenceAndAssociativity {
    public static void main(String[] args) {
        // Precedence
        // (*,/) high  (+,-)low
        int a = 5*6-4/2;
        // output (28)
        System.out.println(a);
        // Associativity
        // (/,*) left to right (+,-) left to right
        int b = 8/4*2+4-2;
        // output (6)
        System.out.println(b);


    }
}
