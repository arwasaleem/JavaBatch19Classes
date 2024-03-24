package org.example.class5;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have a Credit Card?");
        String haveCreditCard=scanner.next();

        if (haveCreditCard.equalsIgnoreCase("yes")){

            // not using equals to avoid the case-sensitivity

            System.out.println("What is the balance on the card?");
            double balance=scanner.nextDouble();
            if (balance>1000){
                System.out.println("Pay off immediately");
            } else {
                System.out.println("You can spend more!");
            }

        } else {
            System.out.println("We can offer you a credit card");

        }

    }
}
