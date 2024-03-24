package org.example.class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("How many years have you worked?: ");
        int yearsWorked = scan.nextInt();

        if (yearsWorked >= 5) {

            System.out.println("Eligible for Bonus!");
            System.out.print("What is your annual salary?: ");
            double salary = scan.nextDouble();


            if (salary > 50000) {
                System.out.println("You get a bonus of $5000");

            } else {
                System.out.println("You get a bonus of $3000");
            }
        } else {
            System.out.println("Not Eligible for Bonus");
        }


    }
}
