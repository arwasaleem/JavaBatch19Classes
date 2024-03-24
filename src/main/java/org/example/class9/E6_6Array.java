package org.example.class9;

public class E6_6Array {
    public static void main(String[] args) {
        int [] numbers={10,25,45,66,85,100,26,89,56,33};
        double sum=0;
        int counter=0; // added to know keep track of numbers that are being considered
        for(int n:numbers){
            if(n<=25){
                continue;

            } else {
                sum+=n;
                counter++;

            }

        }
        System.out.println(sum/counter);


    }
}
