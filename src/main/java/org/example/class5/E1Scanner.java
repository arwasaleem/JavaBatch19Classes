package org.example.class5;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //non-primitive data type
        //new Scanner(System.in) => creates an object of the same scanner class.

        System.out.println("Please Enter your Age");
        int age = scan.nextInt();
        if (age > 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }
    }
}
