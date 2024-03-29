package org.example.class11;

public class E1String {

    public static void main(String[] args) {

            /*
            We are creating the object of the String class
            and storing that object in the str variable
             */
        String str = new String("Today ");
        /*
        we are calling the length method from the String class
        using its object "str" this method is returning the number of
        characters which we are storing in len variable
         */
        System.out.println(str);
        int len = str.length(); // the spaces in the string are also counted as characters.
        System.out.println(len); // this will give the value 6 because 6 characters in "Today "
        System.out.println(str.length()); // this will also give 6

        if (len > 4) {
            System.out.println("String is too long");
        }


    }
}