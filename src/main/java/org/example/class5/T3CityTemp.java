package org.example.class5;

import java.util.Scanner;

public class T3CityTemp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your City: ");
        String city = scan.nextLine();

        System.out.print("What is the temperature in your city?: ");
        double fTemp = scan.nextDouble();
        // Convert Fahrenheit to Celsius
        double cTemp = (fTemp - 32.0) * 5.0 / 9.0;

        System.out.println("The Temperature in the city " + city + " is " + cTemp);
    }
}
