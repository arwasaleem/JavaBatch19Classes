package org.example.class9;

public class E3Array {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 45, 66, 85, 100};
        for (int i = numbers.length - 1; i >= 0; i--) { // "-1" because the there are 6 elements we want to start from 5
            System.out.println(i + " " + numbers[i] + " ");
        }
        //for (int i=5; i>=0; i--) { //can write it like this as well but the other method is better
        //System.out.println(i+" "+numbers[i]+" ");
    }


}



