package org.example.class7;

import java.util.Arrays;

public class E2Arrays {
    public static void main(String[] args) {

        String [] studentNames=new String[50]; // this stores from 0-49
        studentNames[49]="Lora";
        studentNames[21]="James";
        // Used to see all the values in an array
        System.out.println(Arrays.toString(studentNames));


    }
}