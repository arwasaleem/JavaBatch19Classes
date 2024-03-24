package org.example.class5;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the gender m/f");

        /*next is going to pick the first word
        and charAt(0) is going ot pick the first letter from that word
         */

        char gender=scanner.next().charAt(0);
        //when we mention "0" we are asking for the first letter we enter.
        //for the second letter we will put "1" java then a will be displayed
        System.out.println(gender);
    }
}
