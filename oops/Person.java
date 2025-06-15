package oops;

   
class Passport {
    String passportNumber;

    Passport(String number) {
        this.passportNumber = number;
    }
}

public class Person {
    String name;
    Passport passport; // one-to-one association

    Person(String name, Passport passport) {
        this.name = name;
        this.passport = passport;

    }

    public static void main(String[] args) {
        
    
}



}