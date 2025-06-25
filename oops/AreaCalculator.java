package oops;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    int calculateArea() {
        return width * height;
    }
}

class AreaCalculator {

    void printArea(Rectangle rect) {
        System.out.println("Area: " + rect.calculateArea());
    }

    public static void main(String[] args) {
        System.out.println("Enter Width");
        Scanner s = new Scanner(System.in);
        int width = s.nextInt();
        System.out.println("Enter Height");
        Scanner s2 = new Scanner(System.in);
        int height = s2.nextInt();
        Rectangle r = new Rectangle(width, height); // Create a Rectangle object
        AreaCalculator ac = new AreaCalculator(); // Create an AreaCalculator object
        ac.printArea(r); // Pass Rectangle object to printArea()
    }
}
