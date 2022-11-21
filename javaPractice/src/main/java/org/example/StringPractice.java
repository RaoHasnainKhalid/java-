package org.example;

public class StringPractice {
    public static void main(String[] args) {
        String name = "Hasnain     ";
        String lastName = "     Khalid   ";
        System.out.println(name);
        System.out.println(lastName);

        // Length Of String
        System.out.println(name.length());

        // Upper-Case
        System.out.println(name.toUpperCase());

        // Lower-Case
        System.out.println(name.toLowerCase());

        // Trim (Remove Space From String)
        System.out.println(name.trim());

        //SubSrting

        System.out.println(name.substring(5));
        System.out.println(name.substring(2, 5));

        // Replace
        System.out.println(name.replace("sn","s"));
        System.out.println(name.replace("in","n"));

        // Start With (Check True or Fasle)

        System.out.println(name.startsWith("H"));
        System.out.println(name.startsWith("A"));

        // Ends With (Check True or Fasle)
        System.out.println(name.endsWith(" "));
        System.out.println(name.endsWith("N"));

        //Index Of

        System.out.println(name.indexOf("a"));

        // Index of and start with index
        System.out.println(name.indexOf("n",2));

        //Last Index of
        System.out.println(name.lastIndexOf("a"));

        //Character at
        System.out.println(name.charAt(5));

        //Equal and Equal Ignore case

        System.out.println(name.equals("Hasnain     "));
        System.out.println(name.equalsIgnoreCase("HASNAIN     "));

        //Escape Sequence (\\ , \t , \n )
        System.out.println("My\tName\tIs\nHasnain\tKhalid.");
    }
}
