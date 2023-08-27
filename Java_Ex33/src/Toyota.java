/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
abstract class Car {

    abstract void run();
}

public class Toyota extends Car {

    void run() {
        System.out.println("Running Safely");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car obj = new Toyota();
        obj.run();
    }
}
