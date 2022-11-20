package org.example;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        //increment
        // x++ first save then add ++x first add then save
        int x = 5;
        System.out.println(x++);
        System.out.println(++x);
        // decrement
        int y = 5;
        System.out.println(y--);
        System.out.println(--y);

    }
}
