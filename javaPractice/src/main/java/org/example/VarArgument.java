package org.example;

public class VarArgument {
    static int sum(int... arr) {
        int sum = 0;
        for (int e : arr) {
            sum = sum + e;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The Of Number IS: " + sum(1,2,3,4,5));
        System.out.println("The Of Number IS: " + sum(11,12));
        System.out.println("The Of Number IS: " + sum(12,22,23,24,25,26));
    }
}
