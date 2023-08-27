/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Muti Level Inheritance
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

class BabyDog extends Dog {

    void cute() {
        System.out.println("Baby So Cute!");
    }
}

public class TestAnimalInheritanceMutilevel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BabyDog babyShiba = new BabyDog();
        BabyDog babyPooddle = new BabyDog();
        //BabyShiba
        babyShiba.eat();
        babyShiba.run();
        babyShiba.bark();
        babyShiba.cute();
        //BabyPooddle
        babyPooddle.eat();
        babyPooddle.run();
        babyPooddle.bark();
        babyPooddle.cute();
    }

}
