package org.example.class7;

import java.util.Arrays;

public class E5Arrays {
    public static void main(String[] args) {
       char [] grades=new char[5];
       //Storing the letter A inside the box 0
       grades[0]='A';
       grades[1]='B';
       grades[2]='C';
       grades[3]='D';
       grades[4]='E';
       // we only have four boxes last box is at index 3
    //   grades[4]='F';

        System.out.println(Arrays.toString(grades));
        System.out.println(grades[4]+" "+grades[2]);
        // Break till 11:54
    }
}
