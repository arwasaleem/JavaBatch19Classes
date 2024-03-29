package org.example.class11;

public class E7String {
    /*
    count how many times the letter t has appeared in the String
     */
    public static void main(String[] args) {
        String str = "Matt is going to regret soon";
        // System.out.println(str.charAt(3)); // it is going to print the char at index 3
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
           //System.out.println(str.charAt(i)); // will print all the characters of the string separately
            if(str.charAt(i)=='t'||str.charAt(i)=='T'){
                count++;
            }
        }

        System.out.println(count);


        }
    }
