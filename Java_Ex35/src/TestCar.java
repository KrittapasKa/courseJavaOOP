/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
abstract class Car {

    Car() {
        System.out.println("Car is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear Change");
    }
}
//Creating a Child Class with inherite Abstract Classs

class Toyota extends Car {

    @Override
    void run() {
        System.out.println("Running Safely");
    }
}

public class TestCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car obj1 = new Toyota();
        obj1.run();
        obj1.changeGear();
    }

}
