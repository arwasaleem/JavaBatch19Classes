package org.example.class7;

public class Task7 {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25, 30};
        int max = numbers[0]; //easier to compare with the first number
        for (int n : numbers) {
            if (max < n) {
                max = n;
            }

        }
        System.out.println(max);


    }
}
