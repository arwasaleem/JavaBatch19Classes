package org.example.class8;

public class E1Break {
    public static void main(String[] args) {

        String [] names={"James","Iram","Matt Naughty","Ubaidur","Aladdin","Ana","Silvia"};
        // search for the name Iram if it is present print on the console name is present

        for(String n:names){

            if(n.equals("James")){
                System.out.println(n+" is present");
            break; //we stop the loop once completed to not waste time in the process
            }
            // Break terminates the loop prematurely. James is in the first iteration will not continue till the end

        }
    }
}