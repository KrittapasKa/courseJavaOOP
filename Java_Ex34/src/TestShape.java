/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
abstract class Shape {

    abstract void draw();
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class TestShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape obj1 = new Rectangle();
        Shape obj2 = new Circle();
        obj1.draw();
        obj2.draw();
    }

}
