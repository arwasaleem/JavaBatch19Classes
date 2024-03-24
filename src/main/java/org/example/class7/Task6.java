package org.example.class7;

public class Task6 {
    public static void main(String[] args) {
        int [] integers={1,3,5,7,9,11};
        int sum=0;

        for (int num:integers) { // put :, not =
            sum=sum+num;
            System.out.println(sum);
        }


    }
}
