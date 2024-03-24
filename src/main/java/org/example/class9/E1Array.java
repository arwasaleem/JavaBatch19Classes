package org.example.class9;

public class E1Array {
    public static void main(String[] args) {

        int [] numbers ={10,25,45,66,85,100};
        System.out.println(numbers.length); // will print the number of elements in the array; 6.
        System.out.println(numbers[3]); // will print 66, as it is the 3rd element starting from 0.
       // System.out.println(numbers[-5]);
        for (int i = 0; i <numbers.length ; i++) { // ALWAYS use "number.length" rather than writing 6
            System.out.println(i+" "+numbers[i]+" ");

        }


    }
}