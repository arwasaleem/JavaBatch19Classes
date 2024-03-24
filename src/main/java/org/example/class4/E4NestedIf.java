package org.example.class4;

public class E4NestedIf {
    public static void main(String[] args) {

        boolean mainDoor=true;
        boolean room1=true;
        boolean room2=false;

        if(mainDoor){

            if(room1) {
                System.out.println("Room 1 is open");
            }

        }else{
            System.out.println("Main Door is closed");
        }
    }
}
