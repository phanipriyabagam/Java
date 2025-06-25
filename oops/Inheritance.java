package oops;

public class Inheritance {
    public static void main(String[] args) {
       Dog dog = new Dog();
       dog.sound();
  
    }
   
}

class Animal {
    void sound(){
        System.out.println("makes sound");
    }
}

class Dog extends Animal{
  Dog (){
    super();
  }
   

}