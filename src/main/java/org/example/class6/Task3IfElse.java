package org.example.class6;

import java.util.Scanner;

/*
Using scanner class create calculator. Allow user to enter 2
numbers and operator(+,-,*,/). Based on operator provide the result to user.
Please complete this assignment in 2 ways: using
if statement and switch case.

 */
public class Task3IfElse {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter two numbers and the operator +-*/");
        double number1=scanner.nextDouble();
        double number2=scanner.nextDouble();
        char operator=scanner.next().charAt(0);
        if (operator == '+') {
            System.out.println("The result for + operator is " + (number1 + number2));
        } else if (operator == '-') {
            System.out.println("The result for - operator is " + (number1 - number2));
        } else if (operator == '*') {
            System.out.println("The result for operator is " + (number1 * number2));
        } else if (operator == '/') {
            System.out.println("The result for / operator is " + (number1 / number2));
        } else {
            System.out.println("Wrong operator");
        }
    }
}