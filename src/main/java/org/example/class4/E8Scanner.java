package org.example.class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
            System.out.println("Please enter your name");
        String name=scan.nextLine();
            System.out.println("Please enter your age");
        int age=scan.nextInt();
            System.out.println("Please enter your salary");
        double salary=scan.nextDouble();
            // nextLine when entering Strings
        // "next" is used to take one word, "nextLine" when entering the multiple words
            System.out.println("My name is "+name+", My age is "+age+", My salary is $"+salary);



    }
}
