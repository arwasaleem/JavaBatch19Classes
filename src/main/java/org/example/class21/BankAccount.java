package org.example.class21;

public class BankAccount {
    private String name;
    private String userName;
    private String password;

    public BankAccount(String name, String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    public void setName(String name) { // allow us to change the value of instance variables
        this.name = name;
    }

    public String getName() { // other classes can look at the data stored in these fields
        return name;
    }

}
