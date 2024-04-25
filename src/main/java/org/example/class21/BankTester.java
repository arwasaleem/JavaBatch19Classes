package org.example.class21;

public class BankTester {
    public static void main(String[] args) {

        BankAccount b=new BankAccount("Will","User123","Pass123");
        System.out.println(b.getName()); // get the value of the name
        b.setName("James"); // changing the value of name
        System.out.println(b.getName());
    }
}
