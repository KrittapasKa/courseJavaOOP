/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Single Inheritance
class Animal {

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {

    void run() {
        System.out.println("Running Quick Quick");
    }

    void bark() {
        System.out.println("Barking Hoong Hoong");
    }
}

public class TestAnimalInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creating Dog
        Dog Shiba = new Dog();
        Dog Poodle = new Dog();
        //Shiba
        Shiba.eat();
        Shiba.run();
        Shiba.bark();
        //Poodle
        Poodle.eat();
        Poodle.run();
        Poodle.bark();
    }

}
