package org.example.class4;

public class T6Donor {
    public static void main(String[] args) {
        int age=18;
        double weight=110;

        if(age<18){
            System.out.println("You cannot donate blood");

        }else{
            if (weight>110){
                System.out.println("Eligible to donate");
            }else{
                System.out.println("Not eligible to donate");
            }

        }
    }
}
