package com.Questions.Lintcode;
/*
    3400 · Perimeter and Area of a Square
    Description
    Now that you have a Square class that inherits from the predefined 
    class Rectangle, the only thing you need to do is to complete the 
    Square constructor, and finally we will print the perimeter and area 
    of the square using the methods perimeter() and area() in the Reactangle class.
 */
import java.util.Scanner;

class Rectangle {
    protected int width;
    protected int height;

    public Rectangle() {};

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int perimeter() {
        return width * 2 + height * 2;
    }

    public int area() {
        return width * height;
    }

}
class Square extends Rectangle {

    Square(int n) {
        super(n,n);
    }

}
public class perimeterAndAreaOfASquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square square = new Square(sc.nextInt());
            System.out.println(square.perimeter());
            System.out.print(square.area());
    }
}
