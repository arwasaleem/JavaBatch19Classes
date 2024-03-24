package org.example.class5;

import java.util.Scanner;

public class E3Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your First Name");
        String firstName=scanner.nextLine();
        System.out.println(firstName);
    }//next method can only handle on word at a time. So will ignore after the first word
}
