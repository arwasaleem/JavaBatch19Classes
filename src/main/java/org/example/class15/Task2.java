package org.example.class15;

/*
Create a method that will take a String as a parameter
 and returns reversed String. Method should be available
  to all classes within your project
   and accessible by class name.
 */
public class Task2 {

   /* public static String reverseStr(String str){

        return new StringBuilder(str).reverse().toString();
    }
*/

    public static String reverseStr(String str){ // public because we wanted this to be available to all classes within the project
        // static because we wanted it to be accessible by class name

        // return new StringBuilder(str).reverse().toString(); the whole code can be done in 1 single line
        // new StringBuilder(str) -> an object of StringBuilder class is being created
        //.reverse() -> this is going to reverse the string
        //.toString() -> converting it back to String

       String reversedStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedStr=reversedStr+str.charAt(i);
        }
      return reversedStr;
    }

      public static void  main(String[] args) {

        System.out.println(Task2.reverseStr("Monday"));


    }

}
