package org.example.class3;

public class E7Type {
    public static void main(String[] args) {
        int num=10;
        //previously 1000, for smaller values easier.

        byte number=(byte)num;
        //Narrowing can be problematic
        //as the ans we get is -24

        System.out.println(number);
    }
}
