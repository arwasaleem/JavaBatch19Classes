package org.example.class9;

public class E4Array {
    public static void main(String[] args) {
        // Write a program to calculate the avg of these numbers
        // 10 20 30 =>60/3=>20
        int [] numbers={10,25,45,66,85,100};
        int sum=0;// sum always 0 so we can add other numbers to 0
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
        }
        System.out.println(sum/numbers.length);

    }
}