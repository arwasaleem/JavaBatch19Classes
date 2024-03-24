package org.example.class5;

public class E8LogicalOR {
    public static void main(String[] args) {

        boolean flower=false;
        boolean chocolates=false;
        boolean giveCreditCard=true;

        if(flower||chocolates||giveCreditCard){
            System.out.println("Wife is Happy");
        } else {
            System.out.println("Wife is Sad");
        }
    /*
    T || T => T
    T || F => T
    F || T => T
    F || F => F
     */
    }
}
