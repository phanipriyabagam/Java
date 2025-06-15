package oops;
// This code demonstrates the concept of passing objects in Java, specifically focusing on call by value for primitive types.
// In Java, primitive types are passed by value, meaning a copy of the value is passed to the method.
// The swap method attempts to swap the values of two integers, but since they are passed by value, the original values remain unchanged.
class Employee {
   
    int id;

   Employee(int id) {
      this.id = id;
   }
   void display() {
      System.out.println("Employee ID: " + id);
   }
   
}
class check {
    void swap(Employee emp1, Employee emp2) {
        int temp=emp1.id; //do not assign values directly instead use references Ex: Employee temp=emp1 which stores emp1 object ref.
        emp1.id = emp2.id;
        emp2.id = temp;
        System.out.println("Inside swap: x = " + emp1.id + ", y = " + emp2.id + ", temp = " + temp);
    }
}

public class PassingObjects {
   public static void main(String[] args) {
      // Call by value example
        // In Java, primitive types are passed by value, meaning a copy of the value is passed to the method.
      int a = 10;
      int b = 20;
      System.out.println("Before swap: a = " + a + ", b = " + b);
      //System.out.println("After swap: a = " + a + ", b = " + b);
      // Create an instance of the check class
      
        // Call the swap method
        Employee emp1 = new Employee(a);
        Employee emp2 = new Employee(b);
        check obj = new check();
        obj.swap(emp1, emp2);
        System.out.println(obj);
      System.out.println("After swap: emp1.id = " + emp1.id + ", emp2.id = " + emp2.id);
       
   }

    
}