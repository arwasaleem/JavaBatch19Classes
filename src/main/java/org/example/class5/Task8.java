package org.example.class5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scan.nextInt();

        if (number>=1 && number<=10){
            System.out.println("Small Number");
        } else if (number>=11 && number<=100) {
            System.out.println("Medium Number");
        } else if (number>=101 && number<=1000) {
            System.out.println("Large Number");
        } else {
            System.out.println("Invalid Input");
        }

    }
}
