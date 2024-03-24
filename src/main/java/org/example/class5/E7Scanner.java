package org.example.class5;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        //This is another method to avoid the problem with the nextLine method
        //This is only with the nextLine method, no other methods require 2 scanners

        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Please Enter your Age");
        int age=scanner1.nextInt();
        System.out.println("Please Enter your Full Name");
        String fullName=scanner2.nextLine();
        System.out.println("Your Full Name and age is "+fullName+" "+age);


    }
}
