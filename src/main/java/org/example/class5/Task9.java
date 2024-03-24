package org.example.class5;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the time in 24-hr format");

        double time= scan.nextDouble();
        if (time>=1 && time<=11) {
            System.out.println("It is Morning");
        } else if (time>=12 && time<=15) {
            System.out.println("It is Afternoon");
        } else if (time>=16&& time<=20) {
            System.out.println("It is Evening");
        } else if (time>=21 && time<=24) {
            System.out.println("It is Night");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
