package org.example.class5;

import java.util.Scanner;

public class T1LoanSpecialist {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is the amount of Loan needed?");
        int loan=scan.nextInt();
        if (loan<=200000) {
            System.out.println("Loan Approved!");
        }else {
            System.out.println("Loan Rejected!");
        }

    }
}
