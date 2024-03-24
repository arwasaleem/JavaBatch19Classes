package org.example.class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        // new Scanner(System.in) creating the object
        Scanner scan= new Scanner(System.in);
            System.out.println("Please enter your age");

        int age=scan.nextInt(); // input gets stored in the age variable
        // scan.nextInt(); we are calling the nextInt method to take the input from the keyword
            System.out.println("You are "+age+" years old");

    }
}
