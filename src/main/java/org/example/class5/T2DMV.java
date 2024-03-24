package org.example.class5;

import java.util.Scanner;

public class T2DMV {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();

        if(age>=18){
            System.out.println("Eligible for a Driver's Licence");
        } else {
            System.out.println("First, apply for Learner's Permit");
        }
    }
}
