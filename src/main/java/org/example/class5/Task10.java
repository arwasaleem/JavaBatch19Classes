package org.example.class5;

import java.util.Locale;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Birth Month");
        String birthMonth=scanner.nextLine().toUpperCase(); //for case-sensitivity

        switch (birthMonth) {
            case ("NOVEMBER"):
            case ("DECEMBER"):
            case ("JANUARY"):
            case ("FEBRUARY"):
                System.out.println("You were born in season Winter");
                break;
            case ("MARCH"):
            case ("APRIL"):
            case ("MAY"):
                System.out.println("You were born in season Spring");
                break;
            case ("JUNE"):
            case ("JULY"):
            case ("AUGUST"):
                System.out.println("You were born in season Summer");
                break;
            case ("SEPTEMBER"):
            case ("OCTOBER"):
                System.out.println("You were born in season Fall");
                break;


        }



    }
}
