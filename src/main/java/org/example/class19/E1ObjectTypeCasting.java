package org.example.class19;

public class E1ObjectTypeCasting {
    public static void main(String[] args) {

        double a=10;
        int b=(int)a;

        Animal animal=new Dog(); // Object of child class can be stored in the parent class

      // Dog d=(Dog)new Animal(); this is an error because a child can be in the parent, not the opposite.

       Animal d2=new Dog();

       Dog d3=(Dog)d2;




    }
}
