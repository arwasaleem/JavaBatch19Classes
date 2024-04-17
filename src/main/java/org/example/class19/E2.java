package org.example.class19;

public class E2 {
    public static void main(String[] args) {


       Animal a=new Cat();

      // Dog d=(Dog)a; // can't convert a cat to dog

        Cat c=(Cat)a;

        int f=100;
        byte g=(byte)f; // we will lose some data when force converting.

        System.out.println(g);

    }
}
