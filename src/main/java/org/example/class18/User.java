package org.example.class18;
/*
Create User class that has a constructor
that initializes instance variable name and mobile number.
Create a subclass/child class  userInfo that will have user address
variable and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method.
Test your code.
 */
public class User {

   private   String name;
   private String mobileNumber;

   public User(String name,String mobileNumber){
       this.name=name;
       this.mobileNumber=mobileNumber;
   }

   public String getInfo(){ // created this because the fields were private
       return name+" "+mobileNumber;
   }

}

class UserInfo extends User{
  private   String address;
  public UserInfo(String name,String mobilNumber,String address){
      super(name,mobilNumber); // this has to be called first before "this" or else there will be an error
      this.address=address;

  }

  public void printUserDetails(){
      System.out.println(getInfo()+" "+address);
  }

}
class UserTester{
    public static void main(String[] args) {
        UserInfo u=new UserInfo("Will","911","GreenLand");
        u.printUserDetails();
    }
}
