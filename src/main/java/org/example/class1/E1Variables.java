package org.example.class1;

public class E1Variables {

    public static void main(String[] args) {
        //10 200 1000 3 5000
        //12.5 20.3 0.5
        byte age=80; //data type to store whole numbers till 127 only

        System.out.println(age); //when working with variables do not double quote

        short number=200; //for >127 and <100000 we use short to store whole numbers
        int population=100000000; //integer 100000> up to billions (we will be using this)
        long distanceFromSun=125555555500000L; //can store even bigger numbers put an L at the end always
        System.out.println(population);
        System.out.println(number);
    }
}
