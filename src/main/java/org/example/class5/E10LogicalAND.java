package org.example.class5;

public class E10LogicalAND {
    public static void main(String[] args) {

        double math=95;
        double science=92;
        double history=93;

        if (math>90 && science>90 && history>90) {
            System.out.println("Great work, you got an A+");
        } else {
            System.out.println("You need to work hard");
        }




    /*
    T || T => F
    T || F => F
    F || T => F
    F || F => F
    */
    }
}
