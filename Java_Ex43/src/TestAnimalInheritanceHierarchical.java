/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kritt
 */
//Hierarchical Inheritance
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void run() {
        System.out.println("Running  Quick Quick");
    }

    void bark() {
        System.out.println("Barking Hoong Hoong");
    }
}

class Cat extends Animal {

    void run() {
        System.out.println("Running Walk Walk");
    }

    void meow() {
        System.out.println("Meow Meow");
    }
}

public class TestAnimalInheritanceHierarchical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog Pooddle = new Dog();
        Cat Persian = new Cat();
        //Pooddle(Dog)
        Pooddle.eat();
        Pooddle.run();
        Pooddle.bark();
        //Persian(Cat)
        Persian.eat();
        Persian.run();
        Persian.meow();
    }

}
