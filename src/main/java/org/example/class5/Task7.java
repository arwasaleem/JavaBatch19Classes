package org.example.class5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the Day number");

        int day= scan.nextInt();

        if (day==1 || day==2 || day==3 || day==4 || day==5) { // Another approach => if (day>=1 && day<=5)
            System.out.println("It's a Weekday");
        } else if (day==6 || day==7){
            System.out.println("It's a Weekend, YAYY!");
        } else {
            System.out.println("Invalid Input");
        }



    }
}
