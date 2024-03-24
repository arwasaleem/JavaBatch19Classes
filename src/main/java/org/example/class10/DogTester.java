package org.example.class10;

public class DogTester {

    public static void main(String[] args) {
    /*
    We have created a variable dogObj1 which has a
    data type Dog  we are creating the object of Dog
    and we are storing it in dogObj1 variable.
     */
        Dog dog1 = new Dog(); // creates object for this class
        dog1.name = "Jimmi";
        dog1.breed = "German";
        dog1.color = "Black";
        dog1.age = 4;
        dog1.weight = 20;
        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.color);
        System.out.println(dog1.age);
        dog1.bark();
        System.out.println();

        Dog dog2 = new Dog();
        dog2.name = "Bob";
        dog2.color = "White";
        dog2.breed = "BullDog";
        dog2.age = 10;
        dog2.weight = 15;
        System.out.println(dog2.name);
        System.out.println(dog2.color);
        System.out.println(dog2.age);
        dog2.sleep();
        System.out.println();

        Dog dog3 = new Dog();
        dog3.name = "Noodle";
        dog3.breed = "Poodle";
        dog3.color = "Brown";
        dog3.age = 7;
        dog3.weight = 12;
        System.out.println(dog3.name);
        System.out.println(dog3.breed);
        System.out.println(dog3.color);
        System.out.println(dog3.age);
        System.out.println(dog3.weight);
        dog3.eat();
        dog3.sleep();


    }
}